package MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_235_Map_p2 {
    public static void main(String[] args) {

        Map m1 =  new HashMap();
        m1.put(null,"paavani");
        m1.put(null,"reddy");
        m1.put("name","reddy");

        System.out.println(m1);


        System.out.println("---------");

        Map map =new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",3);
        map.put("id3",4);
        map.put("id4",5);
        map.put("id5",6);
        map.put("id6",7);
        map.put(null,101);

        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.get("id3"));












    }
}
