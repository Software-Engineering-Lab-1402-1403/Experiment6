package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // Get package weight
        System.out.print("Enter package weight (in kg): ");
        double packageWeight = scanner.nextDouble();

        // Initialize package and delivery state
//        Package package = new Package(packageWeight);
//        DeliveryState deliveryState = DeliveryState.IN_TRANSIT;
//
//        while (deliveryState != DeliveryState.DELIVERED) {
//            // Display current package status and shipping options
//            System.out.println("\nPackage Status: " + deliveryState);
//            System.out.println("1. Standard Shipping (2.5 $/kg)");
//            System.out.println("2. Express Shipping (3.5 $/kg)");
//
//            // Get shipping method choice
//            System.out.print("Enter shipping method (1/2): ");
//            int shippingMethodChoice = scanner.nextInt();
//
//            // Calculate shipping cost based on selected method
//            double shippingCost;
//            switch (shippingMethodChoice) {
//                case 1:
//                    shippingCost = packageWeight * STANDARD_SHIPPING_RATE;
//                    break;
//                case 2:
//                    shippingCost = packageWeight * EXPRESS_SHIPPING_RATE;
//                    break;
//                default:
//                    System.out.println("Invalid shipping method choice. Please enter 1 or 2.");
//                    continue;
//            }
//
//            // Update package shipping method and cost
//            package.setShippingMethod(shippingMethodChoice);
//            package.setShippingCost(shippingCost);
//
//            // Display shipping cost
//            System.out.printf("Shipping cost: $%.2f\n", shippingCost);
//
//            // Get delivery status update
//            System.out.print("Enter delivery status update (1/2): ");
//            int deliveryStatusUpdate = scanner.nextInt();
//
//            // Update delivery state based on status update
//            switch (deliveryStatusUpdate) {
//                case 1:
//                    deliveryState = DeliveryState.DELIVERED;
//                    System.out.println("Package delivered!");
//                    break;
//                case 2:
//                    break;
//                default:
//                    System.out.println("Invalid delivery status update. Please enter 1 or 2.");
//            }
//        }
//
//        scanner.close();
    }
}