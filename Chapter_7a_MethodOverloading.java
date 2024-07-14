package com.company;

public class Chapter_7a_MethodOverloading {
/*
    // Static means when the method is shared with all the object for a particular class
    // We can call any object of a particular class by using Static method. Other wise we need to define an object in a method

// CASE 1---------Written nothing using void-------------------------------------------------------------------------
    static void telljoke(){
        System.out.println("Joke has been cracked please laugh\n" +
                              "HAHAHAAHAHA");
    }
    public static void main(String[] args) {
        telljoke();
        }

 */


// CASE 2--------------Changing the integer----------------------------------------------------------------------
        /*
    // Form the below method we are just seeing that if we change the value in the method, then it will react to our main method or not.
    // CONCLUSION --> it will not change the value as given in the main method.
    static void change(int a){
        a = 55;
    }

    public static void main(String[] args) {
        int x = 47;
        System.out.println("The value of a is " + x);

         */
// CASE 2-----------Changing the Array-------------------------------------------------------------------------
/*
    // we are going to see whether the value of an array will change or not.
    //CONCLUSION --> In array the value will be change in the main function that the new value providing in the method
    static void array(int[] arr) {
        arr[0] = 89;
    }

    public static void main(String[] args) {
        int [] marks = {55, 78, 68, 87};
        array(marks);
        System.out.println("THe value of marks array is " + marks[0]);
    }
 */

// --------------------METHOD OVERLOADING-------------------------------------
// When two or more same name of methods are coming in a program than that is known as method overloading.
    // We cannot change the written type for a method like in place of void we type int that will not possible for same name of methods
    static void Foo(){
        System.out.println("Good Morning !");
    }
    static void Foo(int a){  // If we write static void Foo() then it will give error but noe it is fine.because it will take an argument
        System.out.println( a + " time JAI SHRI RAM bolo ");
    }
    static void Foo(int a, int b){
        System.out.printf( "format %d  * %d = %d", a, b , a * b   );
    }

    public static void main(String[] args) {
        Foo(); // This will automatic goes to the method 1
        Foo(1000); // This will automatic goes to method 2
        Foo(100, 1000); // this will automatic goes to the method 3
    }



}

