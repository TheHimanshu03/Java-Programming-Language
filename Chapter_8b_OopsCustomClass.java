package com.company;

class Employee{
    // Only one public class is allowed in a program.. Write now it will take this class as Access Modifier
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My Employee id is : " + id);
        System.out.println("My name is : " + name);
    }

    public int getSalary(){
        return salary;
    }
}
public class Chapter_8b_OopsCustomClass {
    public static void main(String[] args) {
        System.out.println("this is a new custom class");
        // Initiating a new employee object
        Employee himanshu = new Employee();
        Employee john = new Employee();

        // Setting the attributes according to the inputs
            himanshu.id = 1732;
            himanshu.name = "Himanshu";
            himanshu.salary = 38000;

            john.id = 1744;
            john.name = "John";
            john.salary = 25000;

        // Printing the attributes
        // System.out.println(himanshu.id);
       //  System.out.println(himanshu.name);

         // -------OR-----
        // We can print the same by the use of method
        himanshu.printDetails();
        int salary = himanshu.getSalary();
        System.out.println(salary);
        john.printDetails();

    }
}
