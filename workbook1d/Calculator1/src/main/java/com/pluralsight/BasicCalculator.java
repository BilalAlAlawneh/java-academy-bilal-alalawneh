package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class BasicCalculator {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("Enter first number: ");
    float num1 = scanner.nextFloat();

    System.out.printf("Enter second number: ");
    float num2 = scanner.nextFloat();

    scanner.nextLine();

    System.out.println("Possible calculations: ");
    System.out.println("(A)dd.\n(S)ubtract.\n(M)ultiply.\n(D)evide");
    System.out.printf("Please Choose an option: ");
    char option=scanner.next().charAt(0);

    if(option=='A'){
        System.out.println("Adding "+num1+" and "+num2+": "+(num1+num2));
    }
    else if(option=='S'){
        System.out.println("Subtracting "+num1+" and "+num2+": "+(num1-num2));
    }
    else if(option=='M'){
        System.out.println("Multiplying "+num1+" and "+num2+": "+(num1*num2));
    }
    else if(option=='D'){
        System.out.println("Deviding "+num1+" and "+num2+": "+(num1/num2));
    }
    else{
        System.out.println("You did not choose one of the choices.");
    }
    }
}