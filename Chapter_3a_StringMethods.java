package com.company;

public class Chapter_3a_StringMethods {
    public static void main(String[] args) {
/*
        String name = "Himanshu";
        System.out.println(name);

 */
       // ------------------------------------------------------------------
 /*
     // name.length() --> will print the length of the character.
        int len = name.length();
        System.out.println(len);


  */
       // ------------------------------------------------------------------
  /*
     // name.toLowerCase() --> This will change all the upper case letter in the lower case.
     // name.toUpperCase() --> This will change all the lower case letter in the upper case.
        String lc = name.toLowerCase();
        System.out.println(lc);
        String uc = name.toUpperCase();
        System.out.println(uc);


   */
       //---------------------------------------------------------------------
 /*
     // name.trim() --> This will remove the extra spaces in the string.
        String nts = "     myNameIsHimanshu      "; // nts -- non trimmed string
        System.out.println(nts.trim());
        // OR
        System.out.println(nts);
        String nts1 = nts.trim(); // This will trim the string in the new variable.
        System.out.println(nts1);

  */
      // -------------------------------------------------------------------------------
/*
    // name.substring(Index start no.) --> This will print the letter after that index number
    // for ex --> Harry --> Index(0,1,2,3,4)--> if index nn is 2 --> this will print rry because it includes index start no.

        String name2 = "Himanshu";
        System.out.println(name2.substring(3));
    // name.substring(Index Start no , Index end no.) --> this will include the start number but exclude the end no.
        System.out.println(name2.substring(2,7));

  */
     // -------------------------------------------------------------------------------
/*
    // name.replace('replace letter', 'replaced with') --. This will replace the letter with the other letter (letters need to be enclosed in ' '
    // name.replace("replace", "replaced with") --. This will replace the letter with more than one letter (letters need to be enclosed in ' '

        String one = "himanshu";
        System.out.println(one.replace('a','t'));
        System.out.println(one.replace("ma","tv"));
        System.out.println(one.replace("h","abc"));

 */
    // -----------------------------Some more methods------------------------------------------------
  /*
        // index --> 0,1,2,3,4,5,6,7
        String name = "himanshu";
        System.out.println(name.startsWith("hi")); // If yes this will return true if no then return false.
        System.out.println(name.endsWith("hu")); // If yes this will return true if no then return false.
        System.out.println(name.charAt(2)); // This will print the character at index 2.
        System.out.println(name.indexOf("a")); //This will print the index no at which the character occur first time.
        System.out.println(name.indexOf("h",(3))); // This will start searching the same character from index 2 according to this.
        System.out.println(name.lastIndexOf("h")); // Will print the last index no of the character occurs in the string
        System.out.println(name.lastIndexOf("h",(3))); // will search the character occurs in that string before the given index no.
        System.out.println(name.equals("himanshu")); //will print true if the string is equal and vice versa
        System.out.println(name.equalsIgnoreCase("Himanshu")); //will print true if the string is equal and vice versa and ignoring character case.
   */

   // -----------Escape Sequence Characetrs----------------------------------------

        // PLEASE DO NOT RUN THE FOLLOWING IT JUST A EXAMPLES TO USE IN PROGRAM
        /*

        \n --> will use to enter the string in new line
        \t --> will use to enter the string with a tab
        \' --> to use ' in a string
        \\ --> to use a backslash(\ ) in a string

         */

    }
}
