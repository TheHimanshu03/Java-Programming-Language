package com.company;

public class a_Intro_Literals {
    public static void main(String[] args) {
        // type sout and press enter to type the System.out.println()
        // type main to print public static void main(String[] args) {}


        // Types of Primitive Data Type
        byte age=30;
        int age1=56;
        short age3=40;
        long age4=566666666666L; //While not using L it will giving a pop up that no is too large.
        char ch='A'; //Must use '' while using character
        float f1=5.6F; // we can also use without F
        double d1=4.66; // we can also use with D
        boolean b=true;
        String a= "Himanshu"; //This will create a string
        //For Print any variable we use the below format.
        System.out.println(age);
        System.out.println(a);
        // println will automatic create a new line.
        System.out.print(age);
        System.out.print(a);
    }
}
// Public --> Can be use in the with in package
// protected -->  can be use in the same package.
// private --> can be use with in the same class.
// default --> Can be take as a default class