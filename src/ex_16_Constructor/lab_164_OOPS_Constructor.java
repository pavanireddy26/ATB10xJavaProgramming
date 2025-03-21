package ex_16_Constructor;

import java.io.FileInputStream;

public class lab_164_OOPS_Constructor {
    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();
        System.out.println(a1);
    }
}

    class A {
        A(){
            System.out.println("I want to read a CSV File");
            System.out.println("Open the page before before loading the scripts");
            System.out.println("You can do anything which you want to do,when object is created");
          //  FileInputStream fileInputStream = new FileInputStream(name:"C://a.txt");
        }
    }

