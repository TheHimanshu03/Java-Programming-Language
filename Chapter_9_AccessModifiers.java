package com.company;

class MyEmployee{
    private int id;
    private String name;
    // Since we use the variable as Private Access Modifier
    // then we cannot print the values directly without using Getter--> get and Setter--> Set

    public void  setName(String n){
        name = n;  // We can also write this as this.name = n;
    }
    public String getName(){
        return name;
    }
    public void setId(int i){
        id = i;  // We can also write this as this.id = i;
    }
    public int getId(){
        return id;
    }
}
// The Get and Set Functions are also known as Getter and Setter.
public class Chapter_9_AccessModifiers {
    public static void main(String[] args) {
        MyEmployee coder = new MyEmployee();
        coder.setName("Himanshu");
        System.out.println(coder.getName());
        coder.setId(22);
        System.out.println(coder.getId());
    }
}
// Access Modifiers --> it specifies where the method/ property is  accessible. Usually are of four types as mentioned below:-
   // private
   // Default
   // Protected
   // Public
// Basically it means if we are trying to access the property of one class from the another class. So you can do or not.