package ex_23_Exceptions;

import java.util.Scanner;

public class Lab_205 {
    public static void main(String[] args) {
     Scanner sc = null;
     sc = new Scanner(System.in);
       int v = sc.nextInt();
        try {
            int a= 10/0;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally {    //finally is to close
            sc.close();
            System.out.println("closing sc");
        }


    }
}
