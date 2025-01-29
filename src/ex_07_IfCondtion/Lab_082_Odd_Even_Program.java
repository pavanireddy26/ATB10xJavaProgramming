package ex_07_IfCondtion;

import java.util.Scanner;

public class Lab_082_Odd_Even_Program {
    public static void main(String[] args) {
        // question-1 : Create a program - take user input
        // check whether the input is even or odd number
//
//        step1: figure out input and output
//        number (int) ->i/o  - scanner clss cn be used to take input
//        string -> odd or even     ->o/p -println
        Scanner sc =new Scanner(System.in);
        System.out.println(" enter int number");
        int num =sc.nextInt();

//        step:2 logic rough
//                num%2 ==0 -> even - modulus- R == 0 ==> even
//                num %2 !=0 =>Odd

       // step:3 logic write

        if (num%2 == 0)
        {
            System.out.println(" even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();  //stop taking input now


        //step:4 :edge cases
         // large int,-ve handle,zero,other input == fail





    }
}
