package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder address = new StringBuilder();

        System.out.println("Please enter the following information: ");
        System.out.printf("Full Name: ");
        String name = input.nextLine();

        System.out.println();

        System.out.printf("Billing Street: ");
        String billingStreet = input.nextLine();

        System.out.printf("Billing City: ");
        String billingCity = input.nextLine();

        System.out.printf("Billing State: ");
        String billingState = input.nextLine();

        System.out.printf("Billing ZIP: ");
        String billingZip = input.nextLine();

        System.out.println();

        address.append(name).append("\n")
                .append("Billing Address: \n")
                .append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(billingZip)
                .append("\n\n");

        System.out.printf("Is shipping address same as billing address(yes or no): ");
        String combination = input.nextLine();
        String loweredCasedCombination = combination.toLowerCase();

        System.out.println();

        if(loweredCasedCombination.equals("yes")){
            String shippingStreet = billingStreet;

            String shippingCity = billingStreet;

            String shippingState = billingState;

            String shippingZip = billingZip;


            address.append("Shipping address: \n")
                    .append(shippingStreet).append("\n")
                    .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip)
                    .append("\n\n");
        }
        else {
            System.out.println("Enter your Shipping Address:");
            System.out.printf("Street: ");

            String shippingStreet = input.nextLine();
            System.out.printf("City: ");

            String shippingCity = input.nextLine();
            System.out.printf("State: ");

            String shippingState = input.nextLine();
            System.out.printf("ZIP Code: ");

            String shippingZip = input.nextLine();

            address.append("Shipping address: \n")
                    .append(shippingStreet).append("\n")
                    .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip)
                    .append("\n\n");
        }

        System.out.println(address.toString());
    }
}