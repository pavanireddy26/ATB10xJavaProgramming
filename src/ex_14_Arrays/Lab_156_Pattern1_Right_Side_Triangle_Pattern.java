package ex_14_Arrays;

import java.util.Scanner;

public class Lab_156_Pattern1_Right_Side_Triangle_Pattern {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        for(int i=0;i < n ;i++){
            for(int j=0 ;j<=i ;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }




















    }
}
