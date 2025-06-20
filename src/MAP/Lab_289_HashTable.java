package MAP;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab_289_HashTable {
    public static void main(String[] args) {

        //Map - K,v ,null values allows

        // Hashtable - sychronised ,dlow and legacy class - thread safe
        // T1,T2 - they will use one by one

        Hashtable<Integer,String> ht1 = new Hashtable();  // do hav enull
        ht1.put(1,"one");
        ht1.put(2,"two");
        ht1.put(3,"three");
//        ht1.put(4,null);
//        ht1.put(null,null);

        System.out.println(ht1);

        System.out.println("---------------");

        HashMap<Integer,String> ht2 = new HashMap();  // have null
        ht2.put(1,"one");
        ht2.put(2,"two");
        ht2.put(3,"three");
        ht2.put(4,null);
        ht2.put(null,null);

        System.out.println(ht2);

        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements())  {
            System.out.println(e.nextElement());
        }





















    }
}
