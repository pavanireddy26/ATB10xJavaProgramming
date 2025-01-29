package ex_07_IfCondtion;

import java.util.Scanner;

public class Lab_078_If_Else {
    public static void main(String[] args) {
        // Allowed to vote or not
        //if age>18 ->allowed to vote
        //else age< 18 -> not allowed to vote

         Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age(as integer)"); // string "pavani"->.InputMismatchException
        int age =sc.nextInt();

        if (age>18){
            System.out.println("you ar allowed to vote");
        }
        else
        {
            System.out.println(" not allowed");
        }


    }
}
