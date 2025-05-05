package ex_23_Exceptions;

import java.io.FileInputStream;

public class Lab_199_Checked {
    public static void main(String[] args) {

        System.out.println("1");
        try {
            int a = 10/0;

        } catch (Exception e) {

            System.out.println("ARE YOU FOOL ? /BY ZERO IS NOT POSSIBLE");
            e.printStackTrace(); // this means full problem detail with line
            System.out.println(e.getMessage());  //  /by zero
            System.out.println("Own message");
        }
        System.out.println("2");


        //Checked -jvm
        // jvm knows abt it ,During compaliation -JVM is sayiing that  there can be  case when this file is not found.

 // JVM knows that this may lead to file not found exception so it telling to handl it

      //  FileInputStream fileInputStream = new FileInputStream("C://log.txt");








    }


}
