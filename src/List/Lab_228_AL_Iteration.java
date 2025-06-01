package List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_228_AL_Iteration {
    public static void main(String[] args) {


        List<String> mylist = new ArrayList();
        mylist.add("pavani");
        mylist.add("Amit");
        mylist.add("reddy");


        for(String str : mylist){
            System.out.println(str);
        }

        System.out.println("-- to print arraylist -2");


        //Iterator
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        System.out.println("  to print Arraylist -3");


      for(int i =0;i< mylist.size();i++){
          System.out.println(mylist.get(i));
      }










    }
}
