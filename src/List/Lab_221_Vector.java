package List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Lab_221_Vector {
    public static void main(String[] args) {

        // vector is also simlar to array list

        Vector v =  new Vector();
       v.add("praveen");
        v.add("reddy");
        v.add("puttu");
        System.out.println(v);
        v.remove("puttu");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);


        System.out.println( "--------------");

        Iterator iterator = v.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        System.out.println("-----Enummeration-----");

        //Extra Enummeration - it is available only in vector and you can iteraton over this element

        Enumeration<String> enumeration =v.elements();
        while(enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }




    }
}
