package com.pluralsight;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double basicCost=29.99;
        double optionsCost = 0.00;
        double underageSurcharge = 0.00;
        double totalcost = 0.00;
        System.out.printf("Please give me your pickup date: ");
        String date = scanner.nextLine();

        System.out.printf("electronic toll tag: ");
        String tollTage = scanner.nextLine();
        if(tollTage.equalsIgnoreCase("yes")){
            optionsCost += 3.95;
        }

        System.out.printf("Do you want GPS: ");
        String GPS = scanner.nextLine();
        if(GPS.equalsIgnoreCase("yes")){
            optionsCost+=2.95;
        }

        System.out.printf("Roadside assistance: ");
        String roadSide = scanner.nextLine();
        if(roadSide.equalsIgnoreCase("yes")){
            optionsCost+=3.95;
        }

        System.out.printf("Number of days: ");
        int days = scanner.nextInt();
        basicCost = basicCost * days;
        optionsCost = optionsCost * days;


        System.out.printf("Your current age: ");
        int age = scanner.nextInt();
        if(age<25){
            underageSurcharge = (basicCost*0.30);
        }
        totalcost = basicCost +optionsCost +underageSurcharge;
        System.out.printf("Pickup date: %s%n", date);
        System.out.printf("Base cost:       $%.2f%n", basicCost);
        System.out.printf("Options cost:    $%.2f%n", optionsCost);
        System.out.printf("Underage fee:    $%.2f%n", underageSurcharge);
        System.out.printf("--------------------------%n");
        System.out.printf("Total cost:      $%.2f%n", totalcost);
    }

}