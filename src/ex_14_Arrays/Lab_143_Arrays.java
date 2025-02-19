package ex_14_Arrays;


public class Lab_143_Arrays {
    public static void main(String[] args) {

        int [] marks={1,2,3,4,5,6};

        //2nd type  -- by using new

        int[]  marks2 = new int[5]; //fixed size
      //  int marks3[] =new int[5];  ----->valid z
        System.out.println(marks2.length);
        String s1 ="pramod";
        System.out.println(s1.length());

        marks2[0] =91;
        marks2[1] =12;
        marks2[2] =13;
        marks2[3] =14;
        marks2[4] =15;

        System.out.println(marks2[0]);
        System.out.println(marks2[4]);
        //System.out.println(marks2[10]); //java.lang.ArrayIndexOutOfBoundsException














    }

}
