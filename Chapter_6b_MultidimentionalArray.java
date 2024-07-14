package com.company;

public class Chapter_6b_MultidimentionalArray {
    public static void main(String[] args) {

        int marks[]; // 1-D array
        int flat [][]; // 2- D array

        // For Example A building in which 2 floors and 3 rooms in each floor
        int flats[][] = new int [2][3]; // 2 is floors and 3 is rooms
        flats[0][0] = 101; // 0 floor pe 0th room
        flats[0][1] = 102; // 0 floor pe 1st room
        flats[0][2] = 103; // 0 floor pe 2nd room
        flats[1][0] = 201; // 1 floor pe 0th room
        flats[1][1] = 202; // 1 floor pe 1st room
        flats[1][2] = 203; // 2 floor pe 2nd room

        // Displaying the 2 D Array
        System.out.println("Printing of 2D array");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        // Same can be done with a 3 D array
        // int ThreeDArray [][][];
    }
}
