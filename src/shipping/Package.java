package shipping;

import shipping.state.InTransitState;
import shipping.state.PackageState;

public class Package {
    private double weight;
    private PackageState state;

    public Package(double weight) {
        this.weight = weight;
        this.state = new InTransitState(this);
        System.out.println(this.state.toString());
    }

    public double getWeight() {
        return weight;
    }

    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
        this.state.updateState();
    }
}
