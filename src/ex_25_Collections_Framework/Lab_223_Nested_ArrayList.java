package ex_25_Collections_Framework;


import java.util.ArrayList;
import java.util.List;

public class Lab_223_Nested_ArrayList {
    public static void main(String[] args) {
//
//       List<Integer> l = new ArrayList();
//       l.add("pramod");
//       l.add(123);
//
       List<String> fruits= new ArrayList();
       fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");
      //  fruits.add(123);
        System.out.println(fruits);



        List<String> fruits1 = new ArrayList();
        fruits1.add("mango");
        fruits1.add("grapes");
        fruits1.add("papaya");
        System.out.println(fruits1);


        List<String> vegatables = new ArrayList();
        vegatables.add("patato");
        vegatables.add("tomato");
        vegatables.add("onion");
        System.out.println(vegatables);



        List all_fruits = new ArrayList();
        all_fruits.add(fruits);
        all_fruits.add(fruits1);
        all_fruits.add(vegatables);
        System.out.println(all_fruits);
        System.out.println(all_fruits.get(0));
        System.out.println(all_fruits.get(1));
        System.out.println(all_fruits.get(2));



    }
}
