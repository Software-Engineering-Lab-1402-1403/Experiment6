package org.example.shipping.state;

public class DeliveredState implements PackageState {

    @Override
    public String toString() {
        return "The package has been delivered.";
    }

    @Override
    public PackageState updateState(int isChanged) {
        return this;
    }
}
