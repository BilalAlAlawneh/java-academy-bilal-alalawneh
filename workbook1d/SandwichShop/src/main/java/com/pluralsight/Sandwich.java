package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sandwich {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float price=0;
        System.out.printf("Choose sandwich type (1 or 2): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Price is $5.45 for regular");
             price=5.45f;
        }
        else if(choice == 2){
            System.out.println("Price is 8.95 for Large");
            price=8.95f;
        }
        scanner.nextLine();

        System.out.printf("would you like your sandwich loaded(yes or no)? ");
        String loaded = scanner.nextLine();

        if (loaded.equalsIgnoreCase("yes")){
            System.out.printf("would you like it extra($1.95) or doubled($2.99)? ");
            String ExtraOption = scanner.nextLine();
            if (ExtraOption.equalsIgnoreCase("extra")) {
                price += 1.95f;
            }
            else if(ExtraOption.equalsIgnoreCase("doubled")) {
                price += 2.99f;
            }
        }

        System.out.printf("PLease enter your age: ");
        int age = scanner.nextInt();

        if(age<=17){
            price=price*0.90f;
            System.out.printf("You receive a 10%% discount, here is your final price $%.2f%n", price);
        }
        else if(age>=65){
            price=price*0.80f;
            System.out.printf("You receive a 20%% discount, here is your final price $%.2f%n", price);
        }
        else{
            System.out.printf("Final price is $%.2f%n", price);

        }
    }
}