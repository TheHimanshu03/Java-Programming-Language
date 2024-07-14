package com.company;
import java.util.Scanner;
public class Chapter_4a_Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age;
        System.out.println("Enter Your age");
        age = sc.nextInt();

        switch (age){
            case 18:
                System.out.println("Adult");
                break;
            case 22:
                System.out.println("Ready for Job");
                break;
            case 60:
                System.out.println("Retirement");
                break;
            default:
                System.out.println("Enjoy Your Life");
        }
        System.out.println("Thanks for using Switch Case!");
// If we do not use the break statement then whenever the first case become true it will print all the other cases (including default).
    }
}
