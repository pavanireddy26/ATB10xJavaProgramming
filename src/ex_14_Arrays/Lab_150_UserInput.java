package ex_14_Arrays;

import java.util.Scanner;

public class Lab_150_UserInput {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size in interger only");
      int size = sc.nextInt();
       // String[]  names= new String[size];  // names
        //Float[] names =new float[size]

        int[] number = new int[size];

        for(int i=0;i<number.length;i++){

            System.out.println("Enter the number");
            number[i] =sc.nextInt();
        }

        System.out.println("-----");

        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

    }
}
