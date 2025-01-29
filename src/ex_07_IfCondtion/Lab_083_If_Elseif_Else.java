package ex_07_IfCondtion;

import java.util.Scanner;

public class Lab_083_If_Elseif_Else {
    public static void main(String[] args) {

      //  num 1 and num2
      // num1 > num2 2-2
        // num1 < num2  2-2
        // num1 > num2 2-3

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1");
        int num1 = sc.nextInt();
        System.out.println("Enter num2");
        int num2 = sc.nextInt();

        if( num1 > num2)
        {
            System.out.println("num1");
        }
        else if(num1 < num2 )
        {
            System.out.println("num2");
        }
        else
        {
            System.out.println( "equal");


        }
    }
}
