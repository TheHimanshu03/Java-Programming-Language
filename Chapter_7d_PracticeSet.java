package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Chapter_7d_PracticeSet {


//------------------------------------------------------------------------------
    /*
//Q1.  WAP to print the multiplication table of a  number n give by the user
    static void table(int n){
        for(int i=1;i<11;i++){
            System.out.printf("%d * %d = %d\n", n ,i, n*i);
        }
    }
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n  = sc.nextInt();
     System.out.printf("The table of the given number is:\n");
        table(n);
    }
     */

//------------------------------------------------------------------------------
  /*
//Q2.  WAP to print the following pattern:-
//    *
//    * *
//    * * *
//    * * * *

   static void Star(int n){
       for(int i=0 ; i<n ; i++){  // we require n number of rows
           for(int j=0 ; j<i+1 ; j++){  // How many times we need to print the stars
               System.out.print("*");
           }
           System.out.println();
       }
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The Star Pattern is created below:");
        Star(n);
    }
    */

//------------------------------------------------------------------------------
    /*
//Q3.  WAP of recursion to calculate the sum of n natural numbers.

    // sum (5)--> 1 + 2 + 3 + 4 + 5
    // sum (n) -->  sum(n-1) + n

    static int sumNatural(int n) {
        if (n == 1) {
            return 1;
        } else {
            return  sumNatural(n - 1) + n ;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value");
        int n = sc.nextInt();
        System.out.println(sumNatural(n));;
    }
     */

//------------------------------------------------------------------------------
    /*
//Q4.  WAP to print the following pattern:-
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

    static void Star(int n){
        for(int i=n ; i>0 ; i--){  // we require n number of rows
            for(int j=0 ; j<i ; j++){  // How many times we need to print the stars
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The Star Pattern is created below:");
        Star(n);
    }
     */

//------------------------------------------------------------------------------
  /*
//Q5. WAP to print the nth term of the fibonacci series.
    // Fib(5)--> 0,1,1,2,3,5   -> Return 3
    // Fib(n) --> fib(n-1) + Fib(n-2)

    static int Fib(int n){
        if (n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return Fib(n-1) + Fib(n-2);
        }
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter any number");
       int n = sc.nextInt();
        System.out.println(Fib(n));;
    }
   */

//------------------------------------------------------------------------------
  /*
//Q6. WAP to find the average of sets of a number passed by the arguments.

    static int Average(int ...arr){
        int result = 0;
        for(int i : arr){
            result = result + i;
        }
        return result/2;
    }

    public static void main(String[] args) {
        System.out.println("Pass the numbers\n" + Average(1,2,3,4,5,5,5,5,4,3,2,1));
    }
    */

}





