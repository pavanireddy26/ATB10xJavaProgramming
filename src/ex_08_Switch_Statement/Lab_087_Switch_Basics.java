package ex_08_Switch_Statement;

import java.util.Scanner;

public class Lab_087_Switch_Basics {
    public static void main(String[] args) {


        // user -Enter int number 1 to 7
        // which day it is it
        //1-mon 2- tue .....8,9,10 ...-1=>invalid


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day ");
        int day = sc.nextInt();


        switch (day) {
            case 1:
                System.out.println("Mon");
                break;

            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;

            default:
                System.out.println("No idea ,what is it");


        }
    }}
