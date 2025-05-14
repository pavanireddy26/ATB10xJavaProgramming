package ex_23_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_212_Interview {
    public static void main(String[] args) {


        try {
            FileInputStream f = new FileInputStream(new File("C://a.log"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("yes");
        }


    }
}
