package ex_06_Increment_Decrement_Operator;

import java.util.Scanner;

public class Lab_074_Task4_UserInput {
    public static void main(String[] args) {
        // Take a user input - Name, Age and Salary and print them in the end.

        String Name;
        int age;
        double salary ;
        Scanner sc = new Scanner(System.in);
         Name =sc.nextLine();
         age= sc.nextInt();
         salary=sc.nextDouble();
        System.out.println("Name: " + Name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);



//        System.out.println(args[1]);
//        System.out.println(args[2]);
//        System.out.println(args[3]);


    }
}
