package org.example.shipping.state;

import static org.junit.Assert.assertEquals;

import org.example.shipping.Package;
import org.example.shipping.state.DeliveredState;
import org.junit.Test;

public class PackageStateTest {

    @Test
    public void testInTransitState() {
        Package myPackage = new Package(10);
        assertEquals("The package is in transit.", myPackage.getState().toString());
    }

    @Test
    public void testDeliveredState() {
        Package context = new Package(10);
        context.setState(new DeliveredState(context));
        assertEquals("The package has been delivered.", context.getState().toString());
    }
}