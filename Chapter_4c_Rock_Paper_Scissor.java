package com.company;
import java.util.Random;
import java.util.Scanner;
public class Chapter_4c_Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Press 0--> Rock, 1--> Paper, 2-->Scissor");
        int comp = ran.nextInt(3);
        System.out.println("Choose a number between 0 to 2");
        int User = sc.nextInt();
        if(User>2){
            System.out.println("Please choose between 0 to 2 only");
            return;
        }

        System.out.println("You Choose " + User);
        System.out.println("Computer Choose " + comp);


        if (User == comp){
            System.out.println("Draw Match");
        }
        else if (User == 0 && comp == 2){
            System.out.println("You Win");
        }
        else if(User == 0 && comp == 1){
            System.out.println("Computer Win You Loose");
        }
        else if(User == 1 && comp == 0){
            System.out.println("You Win");
        }
        else if(User == 1 && comp == 2){
            System.out.println("Computer Win You Loose");
        }
        else if(User == 2 && comp == 0) {
            System.out.println("Computer Win You Loose");
        }
        else if(User == 2 && comp == 1) {
            System.out.println("You Win");
        }
    }
}
