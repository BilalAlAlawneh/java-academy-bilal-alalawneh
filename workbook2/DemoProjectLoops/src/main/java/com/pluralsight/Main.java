package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    emailValidation(scanner);

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d. I will be a good developer%n", i);
        }
        System.out.println();
        for (int i = 81; i >= 1; i--){
            System.out.printf("%2d days left for year up%n", i);
        }

        // 1. FOR LOOP
        // Use when you know how many times you want to repeat
        System.out.println("For Loop: printing even numbers till 50");
        for (int i = 1; i <= 50; i++) {
            if(i%2==0){
                System.out.println("even number:  " + i);
            }
        }

        // 2. WHILE LOOP
        // Use when you don't know how many times in advance
        System.out.println("\nWhile Loop: Counting down timer from 5 seconds");
        int j = 5;
        while (j > 0) {
            System.out.println("Countdown: " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            j--;

        }

        // 3. DO...WHILE LOOP
        // Always runs at least once, even if condition is false
        String enter = "";
        do {
            System.out.println("\nEnter whatever you want(exit to terminate): ");
             enter = scanner.nextLine().trim();
        } while (!enter.equals("exit"));

    }
    public static void emailValidation(Scanner EmailInput){
        System.out.printf("Please enter your email: ");
        String email = EmailInput.nextLine();
        String lowercased = email.toLowerCase();
        System.out.println(lowercased);

        int AtPosition = lowercased.indexOf("@");
        String extraction = lowercased.substring(AtPosition+1);
        System.out.println(extraction);

        if(extraction.equals("yearup.org")){
            System.out.println("Email address validated");
        }
        else {
            System.out.println("Email address not validated");
        }
    }
}