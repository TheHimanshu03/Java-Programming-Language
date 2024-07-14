package com.company;
import java.util.Scanner;
public class c_Intro_Question_1 {

    public static void main(String[] args) {
        System.out.println("Enter 1st subject Marks");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Enter 2nd subject Marks");
        int b= sc.nextInt();
        System.out.println("Enter 3rd subject Marks");
        int c= sc.nextInt();
        System.out.println("Enter 4th subject Marks");
        int d= sc.nextInt();
        System.out.println("Enter 5th subject Marks");
        int e= sc.nextInt();
        float sum= (a+b+c+d+e);
        float div=sum/500f;
        float percent =(div*100);
        System.out.println(percent);
    }
    }