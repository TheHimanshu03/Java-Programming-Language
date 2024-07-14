package com.company;

import java.sql.SQLOutput;

public class Chapter_2_Operators {
    public static void main(String[] args) {
/*
// Arithmetic Operators --> +, -, *, /, %, ++, --...
        int a = 5;
        int b = a+ 6;
        System.out.println(b);
        System.out.println(4.8%1.1); // % (modulo) operator will return the reminder in decimal also

// Assignment Operators --> =, +=, -=, *=...
        a += 10;
        b *= 10;
        System.out.println(a);
        System.out.println(b);

// Comparison Operator --> ==, >, <, >=, <=....
        System.out.println(a>b);
        System.out.println(b>=a);

// Logical Operator --> &&, ||, ...
     // && (and) will give true when all the given statement is true.
     // || (or) will give true when any one statement is true.
        System.out.println(6<4 && 15>13);
        System.out.println(6>7 || 7>5);

// Bitwise Operator ---> these operators are used to calculate the values in the Binary Form.

*/

//------------------------------ PRECEDENCE and ASSOCIATIVITY-------------------------------------------------
/*
    //   Basically those operator which have the more priority that will execute first.
    //     If the precedence is equal for both then we see associativity.


        int x = 6*5-34/2;
        System.out.println(x);

       //     = 30-34/2
       //    = 30-17
       //     = 13
    As * and / are having the equal precedence then we see there associativity
     Associativity is starting from left to right --> means it will execute left operator then will execute the right operator


        int y = 60/5-34*2;
        System.out.println(y);

      //     = 12-34*2
      //     = 12-68
      //     = -56
    As * and / are having the equal precedence then we see there associativity
     associativity is starting from left to right --> means it will execute left operator then will execute the right operator
*/


//-----------------------------------------QUICK QUIZ-----------------------------------------
/*
        // How will we write the expressions in the java.
        int x = 6;
        int y = 1;
        int k = x * y/2;
        // As we will start from left to right
        System.out.println(k);

        int a= 5;
        int b= 1;
        int c= 4;
        int k1= (b*b)-(4*a*c)/(2*a);
        // As the most precedence is given to the ().
        System.out.println(k1);

        int v= 2;
        int u= 3;
        int k2= v*v-u*u;
        // As the precedence is give to *.
        System.out.println(k2);

        int d=4;
        System.out.println(a*b-d);
*/
// -------------------------------INCREMENT and DECREMENT OPERATOR----------------------------------
        // two types of increment operator (i++) and (++i).
        // two types of decrement operator (i--) and (--i).
/*
        int i = 56;
        System.out.println(i++);  // First use and the increment by 1.
        System.out.println(i);
        int j = 44;
        System.out.println(++j);  // First increment by 1 and then use.
        System.out.println(j);

        char ch = 'e';
        char c = ++ch;
        System.out.println(c);
*/

//-----------------------------------------QUICK QUIZ-----------------------------------------
        // What will be the value of the following expression:
/*
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
*/

    }
}