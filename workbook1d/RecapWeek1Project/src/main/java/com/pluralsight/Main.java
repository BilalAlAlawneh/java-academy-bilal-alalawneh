package com.pluralsight;
 import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please enter your exam score(0-100): ");
        int score = scanner.nextInt();

        if(score >=90){
            System.out.printf("Your grade is: A");
        }
        else if(score>=80){
            System.out.printf("Your grade is: B");
        }
        else if(score>=70){
            System.out.printf("Your grade is: C");
        }
        else if(score>=60){
            System.out.printf("Your grade is: D");
        }
        else if(score<60){
            System.out.printf("Your grade is: F");

        }
    }
}