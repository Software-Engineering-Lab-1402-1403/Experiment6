package org.example.shipping.strategy;

import org.example.shipping.Package;
import org.example.shipping.state.DeliveredState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShippingStrategyTest {
    @Test
    public void testStandard() {
        Package myPackage = new Package(10);
        assertEquals(25, (int)Math.floor(myPackage.calculateShippingPrice()));
    }

    @Test
    public void testExpress() {
        Package myPackage = new Package(10);
        myPackage.setStrategy(new ExpressStrategy());
        assertEquals(35, (int)Math.floor(myPackage.calculateShippingPrice()));
    }
}
