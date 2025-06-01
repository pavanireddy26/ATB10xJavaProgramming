package Queue;

import java.util.PriorityQueue;

public class Lab_234_Queue {
    public static void main(String[] args) {
   //queue --0.001 % we use


        //Based on alphabetical order

        PriorityQueue q = new PriorityQueue();
        q.add("pavani");
        q.add("reddy");
        System.out.println(q);

        //queue -first in first out
        //peeks - see the first element   (fifo elemnet ) which want to remove
        //offer - add
        //poll  - delete

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);














    }
}
