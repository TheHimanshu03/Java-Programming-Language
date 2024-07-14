package com.company;
import java.util.Scanner;
import java.util.Random;

public class Chapter_9a_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
    // Below are the indicators to choose the values
        // 0 --> Rock
        // 1 --> Paper
        // 2 --> Scissor

        System.out.println("Choose a number in 0, 1, 2");
        int userInput = sc.nextInt();

        int computerInput = random.nextInt(3);
        if(userInput == 2){
            System.out.println("User Choose : Scissor");
        }
        if(userInput == 1) {
            System.out.println("User Choose : Paper");
        }
        if(userInput == 0) {
            System.out.println("User Choose : Rock");
        }
        if(computerInput == 2){
            System.out.println("Computer Choose : Scissor");
        }
        if(computerInput == 1) {
            System.out.println("Computer Choose : Paper");
        }
        if(computerInput == 0) {
            System.out.println("Computer Choose : Rock");
        }

        if (userInput == computerInput){
            System.out.println("Match Tie, Please try again ");
        }
        else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1 ){
            System.out.println("Hurray You Win! ");
        }
        else{
            System.out.println("oops You Loose!");
        }
    }
}
