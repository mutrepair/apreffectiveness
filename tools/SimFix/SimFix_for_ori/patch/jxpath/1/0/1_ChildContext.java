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
package org.apache.commons.jxpath.ri.axes;

import org.apache.commons.jxpath.Pointer;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;

/**
 * EvalContext that can walk the "child::", "following-sibling::" and
 * "preceding-sibling::" axes.
 *
 * @author Dmitri Plotnikov
 * @version $Revision$ $Date$
 */
public class ChildContext extends EvalContext {
    private NodeTest nodeTest;
    private boolean startFromParentLocation;
    private boolean reverse;
    private NodeIterator iterator;

    public ChildContext(
        EvalContext parentContext,
        NodeTest nodeTest,
        boolean startFromParentLocation,
        boolean reverse) 
    {
        super(parentContext);
        this.nodeTest = nodeTest;
        this.startFromParentLocation = startFromParentLocation;
        this.reverse = reverse;
    }

    public NodePointer getCurrentNodePointer() {
        if (position == 0) {
            if (!setPosition(1)) {
                return null;
            }
        }
        if (iterator != null) {
            return iterator.getNodePointer();
        }
        else {
            return null;
        }
    }

    /**
     * This method is called on the last context on the path when only
     * one value is needed.  Note that this will return the whole property,
     * even if it is a collection. It will not extract the first element
     * of the collection.  For example, "books" will return the collection
     * of books rather than the first book from that collection.
     */
    public Pointer getSingleNodePointer() {
        if (position == 0) {
            while (nextSet()) {
                prepare();
                if (iterator == null) {
                    return null;
                }
                // See if there is a property there, singular or collection
                NodePointer pointer = iterator.getNodePointer();
                if (pointer != null) {
                    return pointer;
                }
            }
            return null;
        }
        return getCurrentNodePointer();
    }

    public boolean nextNode() {
// start of generated patch
return setPosition(getCurrentPosition()+1);
// end of generated patch
/* start of original code
        return setPosition(getCurrentPosition() + -1);
 end of original code*/
    }

    public void reset() {
        super.reset();
        iterator = null;
    }

    public boolean setPosition(int position) {
        int oldPosition = getCurrentPosition();
        super.setPosition(position);
        if (oldPosition == 0) {
            prepare();
        }
        if (iterator == null) {
            return false;
        }
        return iterator.setPosition(position);
    }

    /**
     * Allocates a PropertyIterator.
     */
    private void prepare() {
        NodePointer parent = parentContext.getCurrentNodePointer();
        if (parent == null) {
            return;
        }
        if (startFromParentLocation) {
            NodePointer pointer = parent.getParent();
            iterator = pointer.childIterator(nodeTest, reverse, parent);
        }
        else {
            iterator = parent.childIterator(nodeTest, reverse, null);
        }
    }
}
