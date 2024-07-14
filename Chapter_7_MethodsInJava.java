package com.company;

public class Chapter_7_MethodsInJava {
  /*
    // We need to create a method or function to execute the program without writing the same code
    // Function need to be written before the main code
    static int logic(int x , int y){
            int z;
            if(x>y){
                z = x+y;
            }
            else{
                z = (x+y) * 2;
            }
            return z;
        }
        // Now we need to write the code :-
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c ;
        c= logic(a,b);
        int a1 = 5;
        int b1 = 6;
        int c2;
        c2 = logic(a1,b1);
        System.out.println(c2);
   */

//-------------------------------------Second Method---Calling by an object---------------------------------------------
    // While calling by an object we do not need to type the static method
    int logic(int x , int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 2;
        }
        return z;
    }
    // Now we need to write the code :-
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c ;
        // Class name obj= new class name();
        Chapter_7_MethodsInJava obj = new Chapter_7_MethodsInJava();

        // we are going to call our function using an object.
        c= obj.logic(a,b);
        int a1 = 5;
        int b1 = 6;
        int c2;
        c2 = obj.logic(a1,b1);
        System.out.println(c2);
    }
}
