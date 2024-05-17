package org.example.shipping.strategy;

import org.example.shipping.Package;
import org.example.shipping.state.DeliveredState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShippingStrategyTest {
    @Test
    public void testStandard() {
        Package myPackage = new Package(10);
        assertEquals("The package is in transit.", myPackage.getState().toString());
    }

    @Test
    public void testExpress() {
        Package context = new Package(10);
        context.setState(new DeliveredState(context));
        assertEquals("The package has been delivered.", context.getState().toString());
    }
}
