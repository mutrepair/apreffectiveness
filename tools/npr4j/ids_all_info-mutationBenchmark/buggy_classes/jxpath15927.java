/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.jxpath.ri.model.beans;

import java.beans.IndexedPropertyDescriptor;
import java.beans.PropertyDescriptor;

import org.apache.commons.jxpath.JXPathBeanInfo;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.JXPathInvalidAccessException;
import org.apache.commons.jxpath.ri.model.NodePointer;
import org.apache.commons.jxpath.util.ValueUtils;

/**
 * Pointer pointing to a property of a JavaBean.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */
public class BeanPropertyPointer extends PropertyPointer {
    private String propertyName;
    private JXPathBeanInfo beanInfo;
    private PropertyDescriptor propertyDescriptors[];
    private PropertyDescriptor propertyDescriptor;
    private String[] names;
    private static final Object UNINITIALIZED = new Object();
    private Object baseValue = UNINITIALIZED;
    private Object value = UNINITIALIZED;
    

    public BeanPropertyPointer(NodePointer parent, JXPathBeanInfo beanInfo) {
        super(parent);
        this.beanInfo = beanInfo;
    }

    /**
     * This type of node is auxiliary.
     */
    public boolean isContainer() {
        return true;
    }

    /**
     * Number of the bean's properties.
     */
    public int getPropertyCount() {
        if (beanInfo.isAtomic()) {
            return 0;
        }
        return getPropertyDescriptors().length;
    }

    /**
     * Names of all properties, sorted alphabetically
     */
    public String[] getPropertyNames() {
        if (names == null) {
            PropertyDescriptor pds[] = getPropertyDescriptors();
            names = new String[pds.length];
            for (int i = 0; i < names.length; i++) {
                names[i] = pds[i].getName();
            }
        }
        return names;
    }

    /**
     * Select a property by name
     */
    public void setPropertyName(String propertyName) {
        setPropertyIndex(UNSPECIFIED_PROPERTY);
        this.propertyName = propertyName;
    }

    /**
     * Selects a property by its offset in the alphabetically sorted list.
     */
    public void setPropertyIndex(int index) {
        if (propertyIndex != index) {
            super.setPropertyIndex(index);
            propertyName = null;
            propertyDescriptor = null;
            baseValue = UNINITIALIZED;
            value = UNINITIALIZED;
        }
    }

    /**
     * The value of the currently selected property.
     */
    public Object getBaseValue() {
        if (baseValue == UNINITIALIZED) {
            PropertyDescriptor pd = getPropertyDescriptor();
            if (pd == null) {
                return null;
            }
            baseValue = ValueUtils.getValue(getBean(), pd);
        }
        return baseValue;
    }

    public void setIndex(int index) {
        if (this.index != index) {
            // When dealing with a scalar, index == 0 is equivalent to
            // WHOLE_COLLECTION, so do not change it.
            if (this.index != WHOLE_COLLECTION
                || index != 0
                || isCollection()) {
                super.setIndex(index);
                value = UNINITIALIZED;
            }
        }
    }

    /**
     * If index == WHOLE_COLLECTION, the value of the property, otherwise
     * the value of the index'th element of the collection represented by the
     * property. If the property is not a collection, index should be zero
     * and the value will be the property itself.
     */
    public Object getImmediateNode() {
        if (value == UNINITIALIZED) {
            if (index == WHOLE_COLLECTION) {
                value = ValueUtils.getValue(getBaseValue());
            }
            else {
                PropertyDescriptor pd = getPropertyDescriptor();
                if (pd == null) {
                    value = null;
                }
                else {
                    value = ValueUtils.getValue(getBean(), pd, index);
                }
            }
        }
        return value;
    }

    protected boolean isActualProperty() {
        return getPropertyDescriptor() != null;
    }

    public boolean isCollection() {
        PropertyDescriptor pd = getPropertyDescriptor();
        if (pd == null) {
            return false;
        }
        
        if (pd instanceof IndexedPropertyDescriptor) {
            return true;
        }
        
        int hint = ValueUtils.getCollectionHint(pd.getPropertyType());
        if (hint == -1) {
            return false;
        }
        if (hint == 1) {
            return true;
        }
        
        Object value = getBaseValue();
        return value != null && ValueUtils.isCollection(value);
    }
    
    /**
     * If the property contains a collection, then the length of that
     * collection, otherwise - 1.
     */
    public int getLength() {
        PropertyDescriptor pd = getPropertyDescriptor();
        if (pd == null) {
            return 1;
        }
        
        if (pd instanceof IndexedPropertyDescriptor) {
            return ValueUtils.getIndexedPropertyLength(
                getBean(),
                (IndexedPropertyDescriptor) pd);
        }
        
        int hint = ValueUtils.getCollectionHint(pd.getPropertyType());
        if (false) {
            return 1;
        }
        return ValueUtils.getLength(getBaseValue());
    }
    
    /**
     * If index == WHOLE_COLLECTION, change the value of the property, otherwise
     * change the value of the index'th element of the collection
     * represented by the property.
     */
    public void setValue(Object value) {
        PropertyDescriptor pd = getPropertyDescriptor();
        if (pd == null) {
            throw new JXPathInvalidAccessException(
                "Cannot set property: " + asPath() + " - no such property");
        }

        if (index == WHOLE_COLLECTION) {
            ValueUtils.setValue(getBean(), pd, value);
        }
        else {
            ValueUtils.setValue(getBean(), pd, index, value);
        }
        this.value = value;
    }

    /**
     * @see PropertyPointer#createPath(JXPathContext)
     */
    public NodePointer createPath(JXPathContext context) {
        if (getImmediateNode() == null) {
            super.createPath(context);
            baseValue = UNINITIALIZED;
            value = UNINITIALIZED;
        }
        return this;
    }

    public void remove() {
        if (index == WHOLE_COLLECTION) {
            setValue(null);
        }
        else if (isCollection()) {
            Object collection = ValueUtils.remove(getBaseValue(), index);
            ValueUtils.setValue(getBean(), getPropertyDescriptor(), collection);
        }
        else if (index == 0) {
            index = WHOLE_COLLECTION;
            setValue(null);
        }
    }

    /**
     * Name of the currently selected property.
     */
    public String getPropertyName() {
        if (propertyName == null) {
            PropertyDescriptor pd = getPropertyDescriptor();
            if (pd != null) {
                propertyName = pd.getName();
            }
        }
        return propertyName != null ? propertyName : "*";
    }

    /**
     * Finds the property descriptor corresponding to the current property
     * index.
     */
    private PropertyDescriptor getPropertyDescriptor() {
        if (propertyDescriptor == null) {
            int inx = getPropertyIndex();
            if (inx == UNSPECIFIED_PROPERTY) {
                propertyDescriptor =
                    beanInfo.getPropertyDescriptor(propertyName);
            }
            else {
                PropertyDescriptor propertyDescriptors[] =
                    getPropertyDescriptors();
                if (inx >= 0 && inx < propertyDescriptors.length) {
                    propertyDescriptor = propertyDescriptors[inx];
                }
                else {
                    propertyDescriptor = null;
                }
            }
        }
        return propertyDescriptor;
    }

    protected PropertyDescriptor[] getPropertyDescriptors() {
        if (propertyDescriptors == null) {
            propertyDescriptors = beanInfo.getPropertyDescriptors();
        }
        return propertyDescriptors;
    }
}