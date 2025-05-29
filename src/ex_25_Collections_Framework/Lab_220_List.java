package ex_25_Collections_Framework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_220_List {
    public static void main(String[] args) {


        List mylist = new ArrayList(5);
        List mylist2 = new ArrayList();//array format -continous



        List mylist3= new LinkedList();  //Stored in the format of -Doubly Linked list
        mylist3.add("pavani");
        mylist3.add("praveen");
        mylist3.add("puttu");
        mylist3.add("putti");
        mylist3.add("pottti");
        mylist3.add(null);
        mylist3.add(123);
        mylist3.add(true);
        System.out.println(mylist3);
        System.out.println(mylist3.isEmpty());
        System.out.println(mylist3.isEmpty());
        System.out.println(mylist3.size());
        System.out.println(mylist3.contains("pavani"));
        System.out.println(mylist3.indexOf("reddy"));


















    }
}
