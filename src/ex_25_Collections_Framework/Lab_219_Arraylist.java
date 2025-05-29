package ex_25_Collections_Framework;

import java.util.ArrayList;
import java.util.List;


public class Lab_219_Arraylist {
    public static void main(String[] args) {


        List list = new ArrayList();
        list.add("1"); //0
        list.add("2"); //1
        list.add("3");  //2
        list.add("4"); //3
        list.add(5); //4
        list.add(true); //5

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1)); // interger it is ,all of them are string ""
        System.out.println(list.indexOf("1"));
        System.out.println(list.lastIndexOf("4"));

        System.out.println(list); // to print all
        System.out.println("----");

        for(int i=0;i<list.size();i++) {  //print each element
            System.out.println(list.get(i));
        }



    }
}
