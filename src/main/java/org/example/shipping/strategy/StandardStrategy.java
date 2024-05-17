package org.example.shipping.strategy;

public class StandardStrategy implements ShippingStrategy {
    @Override
    public double calculatePrice(double weight) {
        return weight * 2.5;
    }
}
