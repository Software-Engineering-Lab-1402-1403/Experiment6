package org.example.shipping.strategy;

public class ExpressStrategy implements ShippingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 3.5;
    }
}
