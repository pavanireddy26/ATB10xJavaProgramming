package MAP;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab_235_Map_p1 {
    public static void main(String[] args) {

        Map m1 = new HashMap();

        // map is key - value
        // name:paramod
        //rollno: 1
        // phone :98766543210
        m1.put("name","pramod");
        m1.put("rollno" ,1);
        m1.put("phone",98674210);
        System.out.println(m1);

     //   {phone=98674210, name=pramod, rollno=1}


        System.out.println("-------------");


        Map m2 = new LinkedHashMap();

        // map is key - value
        // name:paramod
        //rollno: 1
        // phone :98766543210
        m2.put("name","pramod");
        m2.put("rollno" ,1);
        m2.put("phone",98674210);
        System.out.println(m2);

        //{name=pramod, rollno=1, phone=98674210}


        System.out.println("-------------");


        Map m3 = new TreeMap();

        // map is key - value
        // name:paramod
        //rollno: 1
        // phone :98766543210
        m3.put("name","pramod");
        m3.put("rollno" ,1);
        m3.put("phone",98674210);
        System.out.println(m3);

      // {name=pramod, phone=98674210, rollno=1}


















    }
}
