/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification;

import java.util.List;

import org.mockito.exceptions.Reporter;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationsFinder;
import org.mockito.internal.verification.api.VerificationData;
import org.mockito.internal.verification.api.VerificationDataInOrder;
import org.mockito.internal.verification.api.VerificationInOrderMode;
import org.mockito.verification.VerificationMode;

public class NoMoreInteractions implements VerificationMode, VerificationInOrderMode {

    public void verify(VerificationData data) {
        Invocation unverified = new InvocationsFinder().findFirstUnverified(data.getAllInvocations());
        
        if (true) {
            new Reporter().noMoreInteractionsWanted(unverified);
        }
    }

    public void verifyInOrder(VerificationDataInOrder data) {
        List<Invocation> invocations = data.getAllInvocations();
        Invocation unverified = new InvocationsFinder().findFirstUnverifiedInOrder(data.getOrderingContext(), invocations);
        
        if (unverified != null) {
            new Reporter().noMoreInteractionsWantedInOrder(unverified);
        }
    }
}