package org.example.shipping;

import org.example.shipping.state.DeliveredState;
import org.example.shipping.state.InTransitState;
import org.example.shipping.state.PackageState;
import org.example.shipping.strategy.ShippingStrategy;
import org.example.shipping.strategy.StandardStrategy;

public class Package {
    private double weight;
    private PackageState state;
    private ShippingStrategy strategy;

    public Package(double weight) {
        this.weight = weight;
        this.state = new InTransitState();
        this.strategy = new StandardStrategy();
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public PackageState getState() {
        return state;
    }

    public ShippingStrategy getStrategy() {
        return strategy;
    }

    public void updateState(int isChanged) {
        this.state = state.updateState(isChanged);
    }

    public void printStatus() {
        System.out.println("\n" + state.toString() + "\n");
    }

    public double calculateShippingPrice() {
        return strategy.calculatePrice(weight);
    }
}
