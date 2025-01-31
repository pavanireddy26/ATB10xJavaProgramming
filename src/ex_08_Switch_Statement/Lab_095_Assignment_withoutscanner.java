package ex_08_Switch_Statement;

import java.util.Scanner;

public class Lab_095_Assignment_withoutscanner {
    public static void main(String[] args) {

        //    Please do this assignment program for us
        //   CLI Options -> Take a user input - Name, Age and Salary and print them in the end.

// we dont use scanner diectly we edit configure

        String name =args[0];


        int age =Integer.parseInt(args[1]);

        double salary =Double.parseDouble(args[2]);

        //print the collected info
        System.out.println("/n -- User Information--");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
