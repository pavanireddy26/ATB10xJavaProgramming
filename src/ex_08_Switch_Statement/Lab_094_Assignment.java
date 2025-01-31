package ex_08_Switch_Statement;


import java.util.Scanner;

public class Lab_094_Assignment {
    public static void main(String[] args) {
    //    Please do this assignment program for us
     //   CLI Options -> Take a user input - Name, Age and Salary and print them in the end.


        Scanner sc = new Scanner(System.in);

        System.out.println(" enter your name");
        String name =sc.nextLine();


        System.out.println(" enter your age");
        int age =sc.nextInt();

        System.out.println(" enter your salary");
        double salary =sc.nextDouble();

       //print the collected info
        System.out.println("/n -- User Information--");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        sc.close();










    }
}
