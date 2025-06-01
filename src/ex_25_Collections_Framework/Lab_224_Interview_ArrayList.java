package ex_25_Collections_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab_224_Interview_ArrayList {
    public static void main(String[] args) {

        List marks = new ArrayList();
        marks.add(91);
        marks.add(95);
        marks.add(56);
        marks.add(89);
        System.out.println(marks);

        Collections.sort(marks);
        // To sort - Collections -class (It contains complete method list ,set,queue may required)
        //collection - Interface
        System.out.println(marks);

        Collections.sort(marks,Collections.reverseOrder());
        System.out.println(marks);








    }
}
