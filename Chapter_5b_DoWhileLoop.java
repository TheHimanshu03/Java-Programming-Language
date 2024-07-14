package com.company;
import java.util.Scanner;
public class Chapter_5b_DoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


// --------------------------------DO WHILE LOOP----------------------------------------------

/*        int a = 0;
        do {
            System.out.println("Hey");
            a++;
        }while (a<5);

 */

// WAP to print n natural number using do while loop.

        int i=0;
        System.out.println("Enter a number to print the natural numbers:");
        int num = sc.nextInt();

        do{
            System.out.println(i);
            i++;
        }while(i<=num);
    }
}
