package com.company;

class rectangle{
    private int length;
    private int breath;

// If we use two constructor in the same class then it is known as overload constructor
    public rectangle() {
        this.length = 10;
        this.breath = 5;
    }

    public rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    public int getLength() {
        return length;
    }

    public int getBreath() {
        return breath;
    }
}
class cylinder{
    private int radius;
    private int height;
/* TO use getter and setter --> Shortcut keys
    press Alt+Insert --> getters and setters--> select the parameters and
    click on ok apply.
 */
    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
/* TO use constructor --> Shortcut keys
    press Alt+Insert --> constructor--> select the parameters and
    click on ok apply.
 */
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return (2* 3.14* radius* radius + 2* 3.14* radius* height);
        // We can use Math.PI for the exact value of PI.
    }
    public double volume(){
        return 3.14* radius* radius* height;
    }
    public double sphere(){
        return (4 * Math.PI *radius * radius);
    }
}
public class Chapter_12_PracticeSet {
    public static void main(String[] args) {

        /*
        //Q1.  Create a class Cylinder and use getters and setters to set the radius and height

        cylinder myCylinder= new cylinder();
        myCylinder.setHeight(15);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(3);
        System.out.println(myCylinder.getRadius());

         */

        /*
        // Q2.  Use Q1 to calculate Surface Area and volume of the cylinder.
        cylinder myCylinder= new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());
         */

        /*
      //Q3.   Use Q1 and print the values using constructor
        cylinder myCylinder= new cylinder(19,18);
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.getRadius());

         */

        /*
        //Q4.   Overload a constructor and initialise the rectangle with length and breath 4 and 5  for using custom parameter.
        rectangle r = new rectangle(6,12);
        System.out.println(r.getBreath());
        System.out.println(r.getLength());

         */
/*
        //Q5.  Use Q1 to find out Sphere.
        cylinder myCylinder= new cylinder(6,9);

        System.out.println(myCylinder.getHeight());

        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.sphere());

 */
    }

}