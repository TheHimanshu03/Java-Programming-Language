package com.company;
import java.util.Scanner;
public class Chapter_5c_ForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// ----------------------------------FOR LOOP------------------------------------------------------
/*
        int i = 0;
        for(i=0; i<=10;i++){
            System.out.println(i);
        }
 */

// WAP to print first n odd natural number using For loop.
/*
        // Even Number = 2*n
        // Odd Number = 2 * n + 1
        System.out.println("Enter a number to find out the odd natural number till that:");
        int n = sc.nextInt();
        for(i=0; i<=10; i++){
            System.out.println(2*i+1);
        }
 */

// ---------------------------------------Decrement in For Loop--------------------------------------------------
/*
        int i;
        for(i=10;i!=0;i--){
            System.out.println(i);
        }
 */

// WAP to print first n odd natural number in reverse order using For loop.

        System.out.println("Enter a number to find out the odd natural number till that:");
        int n = sc.nextInt();
        int i;
        for(i=n;i>0;i--){
            System.out.println(2*i-1);
        }




    }
}
