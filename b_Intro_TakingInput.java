package com.company;
import java.util.Scanner;
public class b_Intro_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the user!");
        Scanner sc = new Scanner(System.in);
        // the above statement will create a new blank object
        //System.in --> identified read from the keyboard
        System.out.println("Enter Number 1");
        boolean b1=sc.hasNextInt();
        // We need to check the input is integer or not
        int a = sc.nextInt();
        //This basically means taking the value from the user
        System.out.println(b1);
        // We will print the case whether it is integer or not
        System.out.println("Enter Number 2");
        int b= sc.nextInt();
        System.out.println(b1);
        int sum= a+b;
        System.out.println("The sum of the above number is ");
        System.out.println(sum);

        // We want a string from the user.
        String str= sc.next();
        System.out.println(str);
        // next is basically just read the first word till the space
        // if we want to print the whole line then need to use .nextline
        String str1= sc.nextLine();
        System.out.println(str1);

    }
}
