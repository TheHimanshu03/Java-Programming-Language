package com.company;

public class Chapter_2a_Practice_Set {
    public static void main(String[] args) {

// Q1. What will be the result of the given expression:- float a= 7/4*9/2 ?
       /*
        float a = 7/4*9/2;
        System.out.println(a);
        // If we print the expression is same as written above then it will give wrong answer as 7/4 and 9/2 is an integer and after
        // the full expression it will convert the same in floating only.
        float b = 7/4.0f*9/2.0f; // If we add 0.f in denominator then it will become the floating value.
        System.out.println(b);
        */
//--------------------------------------------------------------------------------------------------------

// Q2. WAP to encrypt a grade by adding 8 to it. Decrypt it to show the correct Grade ?
      /*
        // Encryption Code
        char grade = 'B';
        grade = (char)(grade + 8); // at last it will give me a character value.
        System.out.println(grade);

        // Decyption Code
        grade= (char)(grade - 8); // This will give me the again same grade.
        System.out.println(grade);
       */
//-----------------------------------------------------------------------------------------------------------

// Q3. WAp using the comparison Operator to find out the given number is greater than the user input number or not ?
        /*
        int num1 = 50;
        System.out.println("Enter the user no: ");
        Scanner sc = new Scanner(System.in);
        int user1= sc.nextInt();
        System.out.println(num1>user1);
         */

//-----------------------------------------------------------------------------------------------------------

// Q4.   Write an expression in the java program ?
       /*
        int k= (v*v-(u*u))/(2*a*s); // This is only the expression and will not run.
        */

//-------------------------------------------------------------------------------------------------------------

// Q5. Find the value for the following expression and find the value of a ?

        /*
        int x = 7;
        int a = 7*49/7 + 35/7;
        System.out.println(a);
         */

    }
}
