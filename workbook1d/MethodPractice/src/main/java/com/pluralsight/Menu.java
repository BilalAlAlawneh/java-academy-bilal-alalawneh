package com.pluralsight;

public class Menu {
    public static void main(String[] args){
    displayMenu();
    displayMenu();
    }
    public static void displayMenu(){
        System.out.println("=== MENU ===");
        System.out.printf("%-10s $%.2f%n", "1. Coffee", 3.99);
        System.out.printf("%-10s $%.2f%n", "2. Tea", 2.99);
        System.out.printf("%-10s $%.2f%n", "3. Cookie", 1.99);
    }
}
