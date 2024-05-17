package org.example.shipping.state;
import org.example.shipping.Package;

public class InTransitState extends PackageState {
    private Package pkg;

    public InTransitState(Package pkg) {
        this.pkg = pkg;
    }

    @Override
    public String toString() {
        return "The package is in transit.";
    }

    @Override
    public void updateState() {
        pkg.setState(new DeliveredState(pkg));
    }
}
