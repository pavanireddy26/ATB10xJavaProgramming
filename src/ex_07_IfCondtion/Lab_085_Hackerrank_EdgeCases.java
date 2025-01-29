package ex_07_IfCondtion;

import java.util.Scanner;

public class Lab_085_Hackerrank_EdgeCases {
    public static void main(String[] args) {

//        Challenge ; ✅ Grade Calculator:
//
//        Write a program that calculates and displays the letter grade
//        for a given numerical score (e.g., A, B, C, D, or F)
//        based on the following grading scale:
//
//        A: 90-100
//
//        B: 80-89
//
//        C: 70-79
//
//        D: 60-69
//
//        F: 0-59


        //Logic Building
//        step1:
//        find input /output
//        input | score ->(0-100)  -- data type ->(ask interviewer which data type he want) int
//        ouput |grade -> data type -> (ask interviewer which data type he want)char

        // step2 .basic logic | rough logic
        // if (score >=90 && score<=100 ->return or print GRADE -A
        // else if (score <=90 && score.=100 ->return or print GRADE -B
        //D
        // else _ grade -F

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score");
        int score= sc.nextInt();
        char grade ='F'; // default value of local variable is good pratice


        if (score >=90 && score<=100)
        {
            grade = 'A';
        }
        else if (score >=80 && score<=89){
            grade ='B';
        }
        else if (score >=70 && score<=79){
            grade ='C';
        }
        else if (score >=60 && score<=69){
            grade= 'D';
        }
        else if (score <=0 || score>=100){
            grade='O';
            System.out.println("lol");
        }
        else {
            grade ='F';
        }
        System.out.println("your grade is "+grade);

    }
}


