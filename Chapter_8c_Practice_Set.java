package com.company;


//-- Q1 ---> Create a class name employee and verify the three methods------------------------------
/*
class Employee1{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    }
}
public class Chapter_8c_Practice_Set {
    public static void main(String[] args) {

        Employee1 himanshu = new Employee1();
        himanshu.setName("Code with himanshu");  // Here we have changed the name of himanshu with code with himanshu
        System.out.println(himanshu.getName());
        himanshu.salary = 35000;
        System.out.println(" Salary of Himanshu is : " + himanshu.getSalary());
    }

    }
*/


// Q2 --> Create a class cell phone with methods to print ringing , vibrating etc.--------------------------------
/*
    class cellPhone {
        public void ring() {
            System.out.println("Ringing....");
        }

        public void vibrate() {
            System.out.println(" Vibrating....");
        }

        public void callFriend() {
            System.out.println("Calling a friend");
        }
        }
    }

 public class Chapter_8c_Practice_Set {
            public static void main(String[] args) {

                cellPhone iPhone12 = new cellPhone();
                iPhone12.ring();
                iPhone12.vibrate();
                iPhone12.callFriend();
            }
    }

 */

// Q3. Calculate a class square with a method to initialize its side, calculating area, perimeter etc.--------------------------
    class Square {
    int side;
    public int Area() {
        return side * side;
    }
    public int perimeter() {
        return 4 * side;
    }
public class Chapter_8c_Practice_Set {
        public static void main(String[] args) {
            Square sq = new Square();
            sq.side = 4;
            System.out.println(sq.Area());
            System.out.println(sq.perimeter());
        }
    }
}
