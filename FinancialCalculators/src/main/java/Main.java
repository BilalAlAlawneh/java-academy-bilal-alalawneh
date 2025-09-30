package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while(!choice.equals("exit")) {

            System.out.printf("Please choose 1 for Mortgage Calculator, 2 for Future Value Calculator,%nand 3 for Present Value Calculator: (Or type exit to exit) ");
            choice = scanner.nextLine();
            System.out.println();

            if (choice.equals("1")) {
                MortgageCalc(scanner);
            } else if (choice.equals("2")) {
                FutureValue(scanner);
            } else if (choice.equals("3")) {
                PresentValue(scanner);
            }
        }

    }

    public static void MortgageCalc(Scanner input){
        System.out.printf("Please enter your principle value: ");
        int principle = input.nextInt();

        System.out.printf("Please enter your interest rate: ");
        double interestPercentage = input.nextDouble();
        double interest = (interestPercentage / 100) / 12;

        System.out.printf("Please enter your loan length in years: ");
        int loanLength = input.nextInt();
        loanLength*=12;

        System.out.println();
        double monthlyPay = principle * (interest * Math.pow(1 + interest, loanLength))
                / (Math.pow(1 + interest, loanLength) - 1);
        double totalInterest = (monthlyPay*loanLength)-principle;

        System.out.printf(
                "A $%,d loan at %.2f%% interest for %d months would have a $%.2f monthly payment.%n" +
                        "Your total interest paid will be $%.2f%n",
                principle, interestPercentage, loanLength, monthlyPay, totalInterest
        );

        input.nextLine();
    }

    public static void FutureValue(Scanner input){
        System.out.printf("Please enter your deposit amount: ");
        int deposit = input.nextInt();

        System.out.printf("Please enter the interest rate gained from the deposite: ");
        double interest = input.nextDouble();
        double fullInterest = interest;
        interest /= 100;

        System.out.printf("Number of years the deposit is going to mature: ");
        int years = input.nextInt();
        int days = years*365;

        double FutureVal = deposit * Math.pow(1 + (interest/365), days);
        double InterestEarned = FutureVal - deposit;
        System.out.printf("If you deposit a $%,d in a CD that earns %.2f%% interest for %,d years.%n" +
                        "Your CD ending balance will be %.2f with %.2f interest paid to you%n",
                deposit, fullInterest, years, FutureVal, InterestEarned);

        input.nextLine();
    }

    public static void PresentValue(Scanner input){
        System.out.printf("Monthly payout: ");
        int monthlyPayout = input.nextInt();

        System.out.printf("Annual interest rate: ");
        double interest = input.nextDouble();
        interest = (interest / 100) / 12;

        System.out.printf("Years: ");
        int years = input.nextInt();
        years*=12;

        double PV = monthlyPayout * (1-Math.pow(1 + interest, -years))  / interest;
        System.out.printf("$%.2f Will need to be in your account today%n", PV);

        input.nextLine();

    }
}