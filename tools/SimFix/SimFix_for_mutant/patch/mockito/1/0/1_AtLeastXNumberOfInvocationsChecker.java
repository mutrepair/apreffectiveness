/*
 * Copyright (c) 2007 Mockito contributors
 * This program is made available under the terms of the MIT License.
 */
package org.mockito.internal.verification.checkers;

import java.util.List;

import org.mockito.exceptions.Reporter;
import org.mockito.internal.debugging.Location;
import org.mockito.internal.invocation.Invocation;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.invocation.InvocationMarker;
import org.mockito.internal.invocation.InvocationsFinder;

public class AtLeastXNumberOfInvocationsChecker {
    
    Reporter reporter = new Reporter();
    InvocationsFinder finder = new InvocationsFinder();
    InvocationMarker invocationMarker = new InvocationMarker();

    public void check(List<Invocation> invocations, InvocationMatcher wanted, int wantedCount) {
        List<Invocation> actualInvocations = finder.findInvocations(invocations, wanted);
        
        int actualCount = actualInvocations.size();
// start of generated patch
if(wantedCount>actualCount){
Location lastLocation=finder.getLastLocation(actualInvocations);
reporter.tooLittleActualInvocations(new AtLeastDiscrepancy(wantedCount,actualCount),wanted,lastLocation);
}
// end of generated patch
/* start of original code
        if (wantedCount >= actualCount) {
            Location lastLocation = finder.getLastLocation(actualInvocations);
            reporter.tooLittleActualInvocations(new AtLeastDiscrepancy(wantedCount, actualCount), wanted, lastLocation);        
        }
 end of original code*/
        
        invocationMarker.markVerified(actualInvocations, wanted);
    }
}
