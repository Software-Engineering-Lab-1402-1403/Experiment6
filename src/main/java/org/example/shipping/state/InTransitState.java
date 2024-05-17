package org.example.shipping.state;

public class InTransitState implements PackageState {
    @Override
    public String toString() {
        return "The package is in transit.";
    }

    @Override
    public PackageState updateState(int isChanged) {
        if (isChanged == 1) {
            return new DeliveredState();
        }
        return this;
    }
}
