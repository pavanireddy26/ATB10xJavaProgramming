package List;


import java.util.ArrayList;
import java.util.List;

public class Lab_218_List {
    public static void main(String[] args) {
//
//     List l= List.of("orange","apple","banana","mango","watermelon");
//        System.out.println(l);
     //static method can be fully implemented in terface.
       // default method - can full implemented in interface

     //l.add("chery"); // unsportedOperatiponsException
     //   l.remove("apple"); //not possible


        ArrayList arrayList = new ArrayList();
        arrayList.add("pavani");
        arrayList.add("reddy");
        arrayList.add("null");

        arrayList.add("reddy"); // duplicate are allowed
        arrayList.add(123); // different datatype are allowed

        System.out.println(arrayList);

        System.out.println(arrayList.size());



        List l = new ArrayList(); //Dyanmic dispatch
        l.add("123");
        l.add("456");
        System.out.println(l);



    }
}
