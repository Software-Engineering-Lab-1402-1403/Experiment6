package org.example.shipping.state;

import org.example.shipping.Package;

public class DeliveredState extends PackageState {
    private Package pkg;

    public DeliveredState(Package pkg) {
        this.pkg = pkg;
    }

    @Override
    public String toString() {
        return "The package has been delivered.";
    }

    @Override
    public void updateState() {
        // No further state transition
    }
}
