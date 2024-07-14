package com.company;

public class Chapter_6_Arrays {
    public static void main(String[] args) {

        // Array indexing Starts with 0... and goes till (n-1)

// ---------------------Three Methods to create an array.--------------------------------------------------------------------------
      //Method 1:
    //    int marks[] = new int[5];  // Known as Declaration + Memory Allocation

      // Method 2:
    //   int[] marks ={100,50,60,70,30} // Known as Declaration + Memory Allocation.

      // Method 3:
        int marks[];  // Known as Declaration
        marks = new int[5];  // Known as Memory Allocation.

        marks[0] =70;
        marks[1] =50;
        marks[2] =80;
        marks[3] =30;
        marks[4] =100;
        marks[5] =57; // While printing this throws an error because we have created only 5 integer value array.
        marks[4] =49; // While printing this we can also update an array.
        System.out.println(marks[4]);
    }
}
