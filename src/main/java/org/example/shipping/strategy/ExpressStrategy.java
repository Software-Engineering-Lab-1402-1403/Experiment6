package org.example.shipping.strategy;

public class ExpressStrategy extends ShippingStrategy{
    @Override
    public double calculatePrice(double weight) {
        return weight * 3.5;
    }
}
