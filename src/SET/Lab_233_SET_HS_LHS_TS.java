package SET;

import java.util.HashSet;
import java.util.*;

public class Lab_233_SET_HS_LHS_TS {

    public static void main(String[] args) {

        Set<String> hs = new HashSet();
        // Hasgin        Set<String> hs = new HashSet();g mechanism to store the elements .no order .no duplicate

        hs.add("Apple");
        hs.add("Orang");
        hs.add("watermelon");
        hs.add("watermelon");
        hs.add(null);
       // hs.add(123);
        hs.add("Apple");
        System.out.println(hs);

        System.out.println("-------------------------");

        Set lhs = new LinkedHashSet();
        //linked list mechanism to store the element
        // order will maintain, no duplicate

        lhs.add("Dpple");
        lhs.add("Apple");
        lhs.add("Orang");
        lhs.add("watermelon");
        lhs.add("watermelon");
        lhs.add(null);
        // lhs.add(123);
        lhs.add("Apple");
        System.out.println(lhs);


        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());


        System.out.println("-------------------------");


        Set ts = new TreeSet();
        // Black and redd tree  mechanism to store the element
        // order will maintain ,nature sorting is done

        ts.add("Dpple");
        ts.add("Apple");
        ts.add("Orang");
        ts.add("watermelon");
        // hs.add(null); -- not allowed null
        // ts.add(123); =not allowed

        System.out.println(ts);


        System.out.println("-----for each loop--");
      for(Object o:ts) {
          System.out.println(o);
      }















    }





}
