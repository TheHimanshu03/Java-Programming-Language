package com.company;
import javax.imageio.stream.ImageInputStream;
import java.util.Scanner;




// When the function call itself in java  is known as the recursion.
public class Chapter_7c_Recursion {

/*
    // ------------Using MethodOverloading ------------------

    // Factorial(n) --> n * factorial(n-1) * factorial(n-2) ..... 1
    // Factorial(5) --> 5 * 4 * 3 * 2 * 1 == 120
    static int factorial(int n) {
        if (n == 1 || n == 0) {  // If the user give the value 1 or 0 then it will return the value of 1.
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n= 5;
        System.out.println("the value of the factorial is " + factorial(n));


    }
}
 */

    // -------------Using Iterative Method-------------------

    /*
    static int factorial_iterative(int n) {
        if (n == 1 || n == 0) {  // If the user give the value 1 or 0 then it will return the value of 1.
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.printf("The Factorial of n is %d", factorial_iterative(n));
    }


     */

    // --------------Using For loop ---------------

/*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        int product = 1;
        if (n == 1 || n == 0) {
            System.out.println("Please choose a different number");
        } else {
            for (int i = 1; i <= n; i++) {
                product = product * i;
            }
        }
        System.out.println(product);
    }
}
 */
}