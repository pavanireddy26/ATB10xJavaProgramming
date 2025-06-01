package MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab_237_Map_Iterate {
    public static void main(String[] args) {



        Map<String,Integer> map =new HashMap();
        map.put("id",1);
        map.put("id",2);
        map.put("id2",3);
        map.put("id3",4);
        map.put("id4",5);
        map.put("id5",null);
        map.put(null,100);


        //iterate for loop x , for each -x ,Entry set ,interator -x

        for (Map.Entry<String,Integer> item:map.entrySet()){
            System.out.println(item.getKey() + "--> " + item.getValue());

        }













    }
}
