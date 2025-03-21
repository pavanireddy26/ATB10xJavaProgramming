package ex_16_Constructor;

import java.util.Scanner;

public class Lab_168_Const {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
        System.out.println("Enter the model name for tesla");
        String model_name =sc.next();
       Car2 tesla =new Car2("tesla 3,2025");

      System.out.println(tesla.model);
       System.out.println(tesla.year);


        System.out.println("-----");

        System.out.println("Enter the model name for Nano");
        String model_name2 =sc.next();
       Car2 nano =new Car2("nano tat",2014);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
