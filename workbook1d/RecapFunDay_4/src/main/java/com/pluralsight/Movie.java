package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Movie {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter movie name: ");
    String movieTitle=scanner.nextLine();
    System.out.println("Enter number of friends: ");
    int friendsAmount= scanner.nextInt();
    System.out.println("Enter pizza price per slice: ");
    double pizzaPerSlice= scanner.nextDouble();
    System.out.println("Is there popcorn: ");
    boolean popcorn= scanner.nextBoolean();

    double totalPizzaCost=Math.round(pizzaPerSlice*(friendsAmount+1));
    System.out.printf("Movie name is: "+movieTitle+", Guests: " +friendsAmount+" Total cost: " +totalPizzaCost+", is there popcorn: "+popcorn);
    }
}