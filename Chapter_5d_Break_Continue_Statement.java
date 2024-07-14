package com.company;

public class Chapter_5d_Break_Continue_Statement {
    public static void main(String[] args) {


//---------------------------BREAK STATEMENT using For Loop-----------------------------------------------
/*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            System.out.println("Hey You");
            if (i == 4) {
                System.out.println("\nProgram Error Found, Loop Ends");
                break;
            }

        }
 */

//---------------------------BREAK STATEMENT using While Loop-----------------------------------------------
/*
        int i=0;
        while(i<10) {
            System.out.println(i);
            System.out.println("Hey You");
            if(i==4){
                System.out.println("\nProgram Error Found, Loop Ends ");
                break;
            }
            i++;
        }
 */

//---------------------------BREAK STATEMENT using Do While Loop-----------------------------------------------
/*
        int i=0;
        do{
            System.out.println(i);
            System.out.println("Hey You");
            if(i==4){
                System.out.println("\nProgram Error Found, Loop Ends ");
                break;
            }
            i++;
        }
        while(i<10);
 */

// --------------------------------CONTINUE STATEMENT using For Loop------------------------------------------------
/*
        for (int i = 0; i < 6; i++) {
            if (i == 4) {
                System.out.println("\nHey Skip me at number 4\n");
                continue;
            }
            System.out.println(i);
            System.out.println("Hey You");

            }
 */

//---------------------------CONTINUE STATEMENT using While Loop-----------------------------------------------
/*
        int i=0;
        while(i<6) {
            i++;
            if(i==4){
                System.out.println("\nHey Skip me at number 4\n");
                continue;
            }
            System.out.println(i);
            System.out.println("Hey You");
        }


 */


//---------------------------CONTINUE STATEMENT using Do While Loop-----------------------------------------------
/*
        int i=0;
        do{
            i++;
            if(i==4){
                System.out.println("\nHey Skip me at number 4\n");
                continue;
            }
            System.out.println(i);
            System.out.println("Hey You");

        }
        while(i<6);
 */



        }

}
