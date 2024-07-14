package com.company;
class myMainEmployee{
    private int id;
    private String name;

    public myMainEmployee(){
        id  = 1732;
        name = "Himanshu";
    }
    public String getName(){ return name; }
    public void setName(String n) { this.name = n; }
    public void setId(int i) { this.id = i;}
    public int getId(){ return id; }
}
public class Chapter_10_Constructors {
    public static void main(String[] args) {
        myMainEmployee Himanshu = new myMainEmployee();
        System.out.println(Himanshu.getId());
        System.out.println(Himanshu.getName());
    }
}
// While we are using constructors it will create a new function with the same name so that we can call directly our
// function to print the values as per the same.
