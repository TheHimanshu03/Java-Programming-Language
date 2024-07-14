package com.company;

public class Chapter_7b_VariableArguments {
    /*
 //----------------------------------------------------------CASE 1-----------------------------------------
    static int sum(int a, int b){
        return(a+b);
    }
    static int sum(int a, int b, int c) {
        return (a + b + c);
    }
    static int sum(int a, int b, int c, int d) {
        return (a + b + c +d);
    }
    public static void main(String[] args) {
        // If we want to print the sum of two integer then we need to create a method which take two integer value as created above
        System.out.println("The sum of two given integer is " + sum(5,7));
        // If we want to print the sum of three integer then we need to create a method which take three integer value as created above
        System.out.println("The sum of three given integer is " + sum(5,7, 3));
        // If we want to print the sum of four integer then we need to create a method which take four integer value as created above
        System.out.println("The sum of four given integer is " + sum(5,7,5,8));
     */

//------------------------------------CASE 2----------------------------------------------------------------

// The above program can be done using variable arguments (Varargs).
    ///*
    static int sum(int...arr) {
        int result = 0;
        for (int a : arr) {    // we read this line as for a in arr --> This will take all the values given in arr.
            result = result + a;
        }
        return result;
    }
public static void main(String[] args) {
            // If we want to print the sum of two integer then we need to create a method which take two integer value as created above
            System.out.println("The sum of two given integer is " + sum(5,7));
            // If we want to print the sum of three integer then we need to create a method which take three integer value as created above
            System.out.println("The sum of three given integer is " + sum(5,7, 3));
            // If we want to print the sum of four integer then we need to create a method which take four integer value as created above
            System.out.println("The sum of four given integer is " + sum(5,7,5,8));


            // We can give as many value as we want and do not need to create the different methods for each numbers
    System.out.println(" The sum of the given n numbers is " + sum(2,3,4,56,7,8,8,9,6,5,3,34,54,6,57,67,8,2));

        }
    // */

    }

