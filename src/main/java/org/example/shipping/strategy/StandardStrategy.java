package org.example.shipping.strategy;

public class StandardStrategy extends ShippingStrategy{
    @Override
    public double calculatePrice(double weight) {
        return weight * 2.5;
    }
}
