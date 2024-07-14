package com.company;

public class Chapter_6a_ForEachLoop {
    public static void main(String[] args) {


// marks.length-->TO find the length of an array-------------------------------------
/*        int[] marks ={100,50,60,70,30};
        float[] marks1 = {55.5f , 44.6f , 56.7f}; // We can also create a array of floating numbers
        String[] student = {"Himanshu", "Coder"}; // We can also create a array of characters.

        System.out.println(marks.length);
        System.out.println(marks1 [1]);
        System.out.println(marks1.length);
        System.out.println(student[0]);
        System.out.println(student.length);

 */

// Displaying of an array-------------------------------------------------------------
/*        int[] marks ={100,50,60,70,30};

        // Method 1:
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("Using Second Method");

        //Method 2: USING FOR LOOP
        int[] marks2 ={50,30,40,20,10};
        for(int i = 0; i<=marks2.length; i++){
            System.out.println(marks2[i]);
        }
*/

// QUICK QUIZ:- WAP to print all the values of an array in a reverse order.-----------------------------------
/*
        int[] marks ={50,30,40,20,10};
        for(int i=marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }

 */

//-----------------Displaying of an array--FOR EACH LOOP-------------------------------------------------------

        int[] percent = {22,45,67,78,89,79,57};
        for(int element: percent){
            System.out.println(element);
        }



    }
}
