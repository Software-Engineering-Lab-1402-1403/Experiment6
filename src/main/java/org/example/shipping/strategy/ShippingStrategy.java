package org.example.shipping.strategy;

public interface ShippingStrategy {
    public default double calculatePrice(double weight) {
        return 0;
    }
}
