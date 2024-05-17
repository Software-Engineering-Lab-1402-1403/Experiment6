package org.example.shipping;

import org.example.shipping.state.DeliveredState;
import org.example.shipping.state.InTransitState;
import org.example.shipping.state.PackageState;

public class Package {
    private double weight;
    private PackageState state;

    public Package(double weight) {
        this.weight = weight;
        this.state = new InTransitState(this);
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public PackageState getState() {
        return state;
    }

        public void updateState() {
        state.updateState();
    }

    public void printStatus() {
        System.out.println(state.toString());
    }
}
