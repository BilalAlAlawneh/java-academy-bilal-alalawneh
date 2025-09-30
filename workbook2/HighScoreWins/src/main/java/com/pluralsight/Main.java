package com.pluralsight;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter a game score (Home:Visitor|21:9) : ");
        String score = input.nextLine();

        String lowercasedScore = score.toLowerCase();
        int firstEnding = lowercasedScore.indexOf(":");
        int secondEnding = lowercasedScore.indexOf("|");

        String firstTeam = lowercasedScore.substring(0,firstEnding);
        String secondTeam = lowercasedScore.substring(firstEnding+1, secondEnding);

        String Scores = lowercasedScore.substring(secondEnding+1);
        int ScoresIndex = Scores.indexOf(":");
        String firstScoreIndex = Scores.substring(0,ScoresIndex);
        String secondScoreIndex = Scores.substring(ScoresIndex+1);

        int firstScore = Integer.parseInt(firstScoreIndex);
        int secondScore = Integer.parseInt(secondScoreIndex);

        if(firstScore > secondScore){
            System.out.printf("Winner: "+firstTeam);
        } else if (secondScore > firstScore) {
            System.out.printf("WInner: "+secondTeam);
        }
        else{
            System.out.printf("It was a tie");
        }

    }
}