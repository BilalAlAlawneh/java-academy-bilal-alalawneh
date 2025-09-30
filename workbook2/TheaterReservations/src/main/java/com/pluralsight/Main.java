package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Please enter your name: ");
        String name = input.nextLine();

        System.out.printf("What date would you be coming (MM/DD/YYYY): ");
        String date = input.nextLine();

        System.out.printf("How many tickets would you like? ");
        int tickets = input.nextInt();

        int firstLastIndex = name.indexOf(" ");
        String firstName = name.substring(0, firstLastIndex);
        String lastName = name.substring(firstLastIndex+1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateChosen = LocalDate.parse(date, formatter);

        System.out.println("You have reserved " + tickets +" ticket(s) on the date " + dateChosen.format(formatter) +
                 " under the name " + lastName + ", " + firstName);

    }
}