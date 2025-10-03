package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle v1 = new Vehicle(101121, "Ford Explorer", "Red", 32775, 12250);
        Vehicle v2 = new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000);
        Vehicle v3 = new Vehicle(101123, "Toyota Prius", "Black", 120000, 8000);
        Vehicle v4 = new Vehicle(101124, "Mercedes E450", "Black", 15980, 56000);
        Vehicle v5 = new Vehicle(101125, "BMW M4", "Purple", 34000, 43000);
        Vehicle v6 = new Vehicle(101126, "Audi A5", "White", 63405, 32450);


        int carCount = 0;
        Vehicle[] inventory = new Vehicle[20];

        inventory[carCount++] = new Vehicle(v1);
        inventory[carCount++] = new Vehicle(v2);
        inventory[carCount++] = new Vehicle(v3);
        inventory[carCount++] = new Vehicle(v4);
        inventory[carCount++] = new Vehicle(v5);
        inventory[carCount++] = new Vehicle(v6);

        //Arrays.sort(inventory);
        System.out.println("Please enter from choices: "
        + "1 for car make, 2 for car ID, 3 for car color, 4 for car price");
        int input = scanner.nextInt();

        if(input == 1) {
            for (int i = 0; i < carCount; i++) {
                System.out.println(inventory[i].getMakeModel());
            }
        }
        if(input == 2) {
            for (int i = 0; i < carCount; i++) {
                System.out.println(inventory[i].getVehicleID());
            }
        }
        if(input == 3) {
            for (int i = 0; i < carCount; i++) {
                System.out.println(inventory[i].getColor());
            }
        }
        if(input == 4) {
            for (int i = 0; i < carCount; i++) {
                System.out.println(inventory[i].getPrice());
            }
        }
    }
}