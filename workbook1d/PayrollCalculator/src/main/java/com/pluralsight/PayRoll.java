package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class PayRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter your name: ");
        String EmployeeName = scanner.nextLine();

        System.out.printf("Enter your wage per hour: ");
        float hrRate = scanner.nextFloat();

        System.out.printf("Enter your hours worked: ");
        float hrWorked = scanner.nextFloat();

        System.out.printf(EmployeeName + " gross pay is:  " + (hrRate*hrWorked));

    }
}