package com.pluralsight;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int highest = 0;
        int lowest = 100;
        double average = 0;

        int [] grades = {78, 98, 65, 91, 44, 59, 81, 86, 72, 88};

        Arrays.sort(grades);

        for(int Grade : grades){
            System.out.println(Grade);

            if(Grade > highest){
                highest = Grade;
            }

            if(Grade < lowest){
                lowest = Grade;
            }

            average+=Grade;

        }
        average = average/10;
        System.out.println("Highest grade is: " + highest + " Lowst grade is: " + lowest + " Your average is: " + average);

        }
    }
