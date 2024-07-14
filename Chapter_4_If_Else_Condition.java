package com.company;
import java.util.Scanner;
public class Chapter_4_If_Else_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    /*
        int age = 19;
        if(age>18){
            System.out.println("Bro you can drive a four wheeler");
        }
        else{
            System.out.println("No Bro you are not allowed to drive a four wheeler");

       }
     */
//-------------------------------------------------------------------------------------------------

// Rational Operators --> are used to compare the inside the If/Else statements
    /*
        // == --> equal to
        // >= --> Greater than equal to
        // <= --> Lower than equal to
        // != --> Not Equal to

        int verify = 18;
        if(verify == 18) {
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
     */

//----------------------------------------------------------------------------------------------

// Logical Operators --> commonly used in logical statements in If/Else.
    /*
        // && --> and --> if both the conditions are true
        // || --> Or --> if either one condition is true
        // ! --> Not --> will reverse the values.

        Boolean a = true;
        Boolean b = false;
        if (a && b) {
            System.out.println("True");
        }
        else {
            System.out.println("False");  // This will give false because one statement is false.
      // if we want true then we need both the conditions get true.
      // We can use the && operator for more than one values
        }

        if (a || b){
            System.out.println("true");
        }
        else{
            System.out.println("false"); // This will print the true because at least the one statement is true.
        }

        System.out.println(!a);  // Value of a is true this will reverse the same
        System.out.println(!b);  // value of b is false this will reverse the value
     */

//----------------------------------------------------------------------------------------------

// Else If Nested Loop:
    /*
        int age;
        System.out.println("Enter Your Age");
        age = sc.nextInt();

        if(age>18){
            System.out.println("You are adult");
        }
        else if(age>12){
            System.out.println("You are a teenager");
        }
        else if(age<18){
            System.out.println("You are not adult");
        }
        else{
            System.out.println("Enter Correct Value");
        }
     */

    }
}
