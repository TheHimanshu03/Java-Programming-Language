package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Chapter_4b_Practice_Set {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//------------------------------------------------------------------------------------------------
// Q1. What will be the output of the following program:
/*
        int a = 10;
        if(a = 11){  // we cannot give the assignment in the conditionals.
            System.out.println("i am 11");
        }
        else{
            System.out.println("i am not 11");
        }
        // ANSWER: Throwing an error.
 */

//--------------------------------------------------------------------------------------------------
// Q2. WAP to find out a student is pass or fail if it requires total 40% and at least 33% in each subject.
//     Assume three subject and take marks from user.
/*
        float sub1, sub2, sub3;
        System.out.println("Enter the marks of 1st subject out of 100");
        sub1 =sc.nextFloat();
        System.out.println("Enter the marks of 2nd subject out of 100");
        sub2 = sc.nextFloat();
        System.out.println("Enter the marks of 3rd subject out of 100");
        sub3 = sc.nextFloat();

        float total = (sub1+sub2+sub3);
        float percent = total/3.0f;

        if(percent>40.0f && sub1>33.0f && sub2>33.0f && sub3>33.0f){
            System.out.println("You are PASS");
        }
        else{
            System.out.println("You are FAIL");
        }
 */

//--------------------------------------------------------------------------------------------------
// Q3. Calculate Income tax paid by the employee to the government slab as per the given below
       /* 2.5l - 5l == 5%
        5l - 10l == 20%
        above 10l == 30%  */
/*
        System.out.println("Enter your annual income");
        float income = sc.nextFloat();
        float tax = 0;

        if(income<250000.0f){
            tax = tax + 0;
        }
        else if(income>250000.0f && income<500000.0f){
            tax = tax + 0.05f * (income - 250000);
        }
        else if(income>500000.0f && income<1000000.0f){
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (income - 500000);

        }
        else if(income>1000000.0f){
            tax = tax + 0.05f * (500000 - 250000);
            tax = tax + 0.2f * (1000000 - 500000);
            tax = tax + 0.3f * (income - 1000000);
        }
            System.out.println("The total tax is : " + tax);
 */

//--------------------------------------------------------------------------------------------------
// Q4. WAP to find out the day of week given the number [1 for monday...etc]
/*
        int num;
        System.out.println("Choose a number between 1 to 7 to print the day!");
        num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }
*/

//--------------------------------------------------------------------------------------------------
// Q5. WAP to find the year is leap year or not.
/*
        int year;
        System.out.println("Enter a year");
        year = sc.nextInt();

        if (year/4!=0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
*/

//--------------------------------------------------------------------------------------------------
// Q6. WAP to find out the type of website from the URL
/*
        String website;
        System.out.println("Enter the website");
        website = sc.next();

        if (website.endsWith(".org")) {
            System.out.println("This is Organization Website");
        }
        else if (website.endsWith(".com")){
                System.out.println("This is Commercial Website");
        }
        else if (website.endsWith(".in")) {
            System.out.println("This is Indian Website");
        }
        else {
            System.out.println("Please enter the correct URL");
        }
*/

    }
}
