package List;

import java.util.Stack;

public class Lab_229_Stack {
    public static void main(String[] args) {

        //stack - last in first out
//
//       Stack s = new Stack();
//       s.add("pavani");
//       s.add("reddy");
//        System.out.println(s);

        Stack s = new Stack();
        s.push("pramod");
        s.push("reddy");
        s.push("amit");
        s.push("dutta");
        System.out.println(s);


        System.out.println(s.size());
        System.out.println(s);

        System.out.println(s.peek()); // peek isthe last element
        System.out.println(s);

        System.out.println(s.pop());  // it will remove the element
        System.out.println(s);

        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("snehal"));
        System.out.println(s);
        s.add("chetan");
        s.add("chetan");

        s.push("vijju");
        System.out.println(s);

        System.out.println(s.get(0));
        System.out.println(s.get(1));


















    }
}
