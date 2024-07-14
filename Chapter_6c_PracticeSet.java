package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Chapter_6c_PracticeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//----------------------------------------------------------------------------
// Q1. Calculate the Sum of 5 Float array.
/*
        float numbers [] = {55.5f, 48.5f, 39.7f, 50.7f, 79.7f};
        float sum = numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
        System.out.printf("The Sum of the given 5 arrays is : %f",  sum);
*/
        //---- OR USING FOR EACH LOOP---
/*
        float numbers [] = {55.5f, 48.5f, 39.7f, 50.7f, 79.7f};
        float sum =0;
        for(float element:numbers){
            sum = sum + element;
        }
        System.out.printf("The Sum of the given 5 arrays is : %f",  sum);
 */


//----------------------------------------------------------------------------
// Q2. Find a given integer is present in the array or not.
/*
        int number [] = {55, 48, 39, 50, 79};
        System.out.println("Enter a number to check");
        int n = sc.nextInt();
        boolean Isarray = false;
        for(int element:number) {
            if (n == element) {
                Isarray = true;
                break;
            }
        }
        if(Isarray){
            System.out.println("No is present in array");
        }
        else{
            System.out.println("No is not present in array");
        }

 */

//----------------------------------------------------------------------------
// Q3. Calculate the avg. marks of an array marks using for loop.
/*
        float marks[] = {44.0f, 56.5f, 70.5f, 49,5f, 80.0f};
        float sum=0;
        float avg= 0;
        for(float element: marks){
            sum=sum+element;
            avg =sum/5;
        }
        System.out.printf("The average of the marks is : %f", avg);

 */

//----------------------------------------------------------------------------
// Q4. Create a java program to add two matrix of size 2*3.

        int [][] mat1 = {{2,3,4},
                         {5,6,7}};

        int [][] mat2 = {{1,2,3},
                         {4,5,6}};

        int [][] result = {{0,0,0},
                           {0,0,0}};

        // Setting the valued that need to be calculted
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value of i=%d and j=%d\n", i,j);
                result[i][j]= mat1[i][j] + mat2[i][j];

            }
        }
        // Printing the elements of the result matrix
        for(int i=0;i<mat1.length;i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }


//----------------------------------------------------------------------------
// Q5. WAP to reverse an array?



    }
}
