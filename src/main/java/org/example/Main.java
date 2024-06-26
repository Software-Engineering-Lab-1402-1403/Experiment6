package org.example;

import org.example.shipping.Package;
import org.example.shipping.state.DeliveredState;
import org.example.shipping.strategy.ExpressStrategy;
import org.example.shipping.strategy.StandardStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter package weight (in kg): ");
        double packageWeight = scanner.nextDouble();

        Package myPackage = new Package(packageWeight);

        while (!(myPackage.getState() instanceof DeliveredState)) {
            myPackage.printStatus();
            System.out.println("1. Standard Shipping (2.5 $/kg)");
            System.out.println("2. Express Shipping (3.5 $/kg)");

            System.out.print("Enter shipping method (1/2): ");
            int shippingMethodChoice = scanner.nextInt();

            switch (shippingMethodChoice) {
                case 1:
                    myPackage.setStrategy(new StandardStrategy());
                    break;
                case 2:
                    myPackage.setStrategy(new ExpressStrategy());
                    break;
                default:
                    System.out.println("Invalid delivery status update. Please enter 1 or 2.");
            }

            System.out.println("1. Package is Delivered!");
            System.out.println("2. Keep Package in transit!");

            System.out.print("Enter delivery status update (1/2): ");
            int deliveryStatusUpdate = scanner.nextInt();
            myPackage.updateState(deliveryStatusUpdate);
        }
        myPackage.printStatus();
        System.out.println("Final Price After The Package is Delivered: " + myPackage.calculateShippingPrice() + "$");
        scanner.close();
    }
}