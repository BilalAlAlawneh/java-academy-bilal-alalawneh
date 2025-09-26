package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args){
        isEven(4);
        isPositive(-98.98);

    }
    public static void isEven(int number){
        if(number % 2 == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
    public static void isPositive(double number){
        if(number>=0){
            System.out.println("Number is positive");
        }
        else{
            System.out.println("number is negative");
        }
    }
}
