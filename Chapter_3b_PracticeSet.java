package com.company;

public class Chapter_3b_PracticeSet {
    public static void main(String[] args) {

// ---------------------------------------------------------------------------------------------------

// Q1 WAP to convert the string in the lower case.
        String name = "HIMANSHU IS LEARNING A JAVA LANGUAGE";
        System.out.println(name.toLowerCase());

// ---------------------------------------------------------------------------------------------------

// Q2 WAP to replace the string's space with underscore.
        String name1 = "HIMANSHU IS LEARNING A JAVA LANGUAGE";
        System.out.println(name1.replace(" ","_"));

// ---------------------------------------------------------------------------------------------------

// Q3 WAP to fill the letter template.
        String letter = "Dear <|name|>, Welcome to coding class!";
        letter = letter.replace("<|name|>", "Himanshu");
        System.out.println(letter);

// ---------------------------------------------------------------------------------------------------

// Q4 WAP to detect the double or triple space in a string.
        String detectDoubleSpace = "him  anshu";
        String detectTripleSpace = "himan   shu";
        System.out.println(detectDoubleSpace.indexOf("  "));
        System.out.println(detectTripleSpace.indexOf("   "));

// ---------------------------------------------------------------------------------------------------

// Q5 WAP to write the following letter with "" comma's using Escape Sequence Method.

        String line = "\"Dear Himanshu,\n \tThanks for completing the course of Python and C!\"";
        System.out.println(line);


    }
}
