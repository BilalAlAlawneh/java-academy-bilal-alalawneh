package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1.
        int bobSalary=120000;
        int garySalary=142400;
        int highestSalary=Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is "+highestSalary);

        //2.
        int carPrice=23000;
        int truckPrice=31989;
        int lowestPrice=Math.min(carPrice, truckPrice);
        System.out.println(lowestPrice);

        //3
        double radius=7.25;
        double area=Math.PI*(radius*radius);
        System.out.println(area);

        //4
        double num=5.0;
        double result=Math.sqrt(num);
        System.out.println(result);

        //5
        int num1=5;
        int num2=10;
        int num3=85;
        int num4=50;
        int difference1=num1-num2;
        int difference2=num3-num4;
        int final1=Math.abs(difference1);
        int final2=Math.abs(difference2);
        System.out.println(final1+" and "+final2);

        //6
        double negativeNum=-3.8;
        System.out.println(Math.abs(negativeNum));

        //7
        double random=Math.random();
        System.out.println(random);

        //8
        int days=24;
        long minutes;
        long milliseconds;

        minutes=60*24*60;
        milliseconds=minutes*60*60;
        System.out.println(minutes+" minutes, "+milliseconds+" milliseconds");

    }
}