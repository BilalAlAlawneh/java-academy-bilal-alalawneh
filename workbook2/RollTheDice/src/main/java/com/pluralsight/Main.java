package com.pluralsight;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;

        int counter = 0;
        int sum;

        int twoCounter=0;
        int fourCounter=0;
        int sixCounter=0;
        int sevenCounter=0;

        while (counter <100){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll2 + roll1;
            System.out.println(roll2+" + "+roll1+" = "+sum);

            if(sum == 2){twoCounter++;}
            if(sum == 4){fourCounter++;}
            if(sum == 6){sixCounter++;}
            if(sum == 7){sevenCounter++;}
            counter++;
        }
        System.out.println("two counter: " + twoCounter);
        System.out.println("four counter: " + fourCounter);
        System.out.println("six counter: " + sixCounter);
        System.out.println("seven counter: " + sevenCounter);
    }
}