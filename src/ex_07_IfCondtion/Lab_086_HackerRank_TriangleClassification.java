package ex_07_IfCondtion;

import java.util.Scanner;

public class Lab_086_HackerRank_TriangleClassification {
    public static void main(String[] args) {

//    ✅ Triangle Classifier:

//    Que:    Write a program that classifies a triangle based on  its side lengths.
//             Given three input values representing the lengths of the sides,
//             determine if the triangle is equilateral (all sides are equal), isosceles
//            (exactly two sides are equal), or scalene
//            (no sides are equal). Use an if-else statement
//             classify the triangle.

              //side1 ,side2,side3 == equalant, isoscele ,scalene
//
//        step:1 Logic building
//                find the input and output
//                input= side1,side2,side3 ->data=Double
//                Output= sop=>String or message = equalant,iso,scalane



        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length of the side1:");
        double side1=sc.nextDouble();

        System.out.println("Enter length of the side2:");
        double side2=sc.nextDouble();

        System.out.println("Enter length of the side3:");
        double side3=sc.nextDouble();


        //Basic Logic/Rough logic
        // if side1 ==side2 and side2 ==side3 ,side1==side3 -equalaterial
         // if side1==side2 and side2==side3 and side1 ==side3 = is0
       //
        // else -scalane
         if(side1 <= 0 ||side2 <= 0 || side3 <= 0){
             System.out.println("Invalid input:side length must be positive");
         }
          else {


             if (side1 == side2 && side2 == side3 && side1 == side3) {
                 System.out.println("The traingle is Equalaterial");

             } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                 System.out.println("The triangle is isolate");
             } else {
                 System.out.println("The triangle is scalane");
             }
         }
        sc.close();








    }
}
