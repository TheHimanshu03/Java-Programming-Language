package com.company;
///*
class base1{
    base1(){     // Constructor will be printed while making the object of class.
        System.out.println("I am a constructor of base class");
    }
}
class derived1 extends base1{
    derived1(){
        System.out.println("Hi I m a constructor of Derived class");
    }
}
class base2 {
    base2() {     // Constructor will be printed while making the object of class.
        System.out.println("I am a constructor of base2 class");
    }

    // For Overloaded Constructor-------------
    base2(int a) {
        System.out.println("I am an overloaded constructor with value of : " + a);
    }
}
    class derived2 extends base2 {
        derived2() {
            super(3); //But if we want to print the second statement of base2 constructor then we need to use "super" key word
            System.out.println("Hi I m a constructor of Derived2 class");
        }
    }
public class Chapter_13a_Constructor_in_Inheritance {
    public static void main(String[] args) {
      base1 b = new base1(); // This will print the constructor of base class only.
     derived1 d = new derived1(); // if we create the object of derived class also then first constructor will print of base class then derived class

        derived2 d2 = new derived2();
// The above statement first print the first statement of the base2 constructor then print the value of derived constructor.

    }
}
//*/

