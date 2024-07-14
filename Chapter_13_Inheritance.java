package com.company;

// Inheritance basic meaning is --> Code Reuseability
//    Ek purani class ki property ko aage aane wale new classes me use krwa skte hai that is known as Inheritance
// we use "Extends" Keyword to declare the inheritance.
class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base class and setting value of x now.");
        this.x = x;
    }
}
class Derived extends Base{
    // This means a new derived class which contains the base class also.
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
class Animal{
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("the below number is showing the age of animal");
        this.age = age;
    }
}
class Dog extends Animal{
    public int getInjection() {
        return injection;
    }

    public void setInjection(int injection) {
        System.out.println("The below number is showing the no of injection need to be give");
        this.injection = injection;
    }

    int injection;

}
public class Chapter_13_Inheritance {
    public static void main(String[] args) {
        // CASE 1: Using Base class
        Base b = new Base();
        b.setX(5);
        System.out.println(b.getX());
        // CASE 2: Using Derived class
        Derived d = new Derived();
        d.setX(6);
        System.out.println(d.getX());
        d.setY(7);
        System.out.println(d.getY());
        // From Case 2 we will use derived class and call the value of base class integer.

    // ----------------------QUICK QUIZ-------------------------------
    // Q1. Create a class Animal and derived Dog from it ?

       Animal a = new Animal();
       a.setAge(10);
        System.out.println(a.getAge());
        Dog o = new Dog();
        System.out.println("Age has been changed with the help of inheritance");
        o.setAge(13);
        System.out.println("the new age will be  ");
        System.out.println(o.getAge());
        o.setInjection(3);
        System.out.println(o.getInjection());
    }
}
