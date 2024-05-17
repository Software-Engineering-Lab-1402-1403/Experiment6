package org.example.shipping.state;

public interface PackageState {
    public default PackageState updateState(int isChanged) {
        return null;
    }

    public String toString();
}
