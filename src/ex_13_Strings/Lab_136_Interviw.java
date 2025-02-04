package ex_13_Strings;

public class Lab_136_Interviw {
    public static void main(String[] args) {

        String s1 = "hello";
        String s2 ="hello"; //2


        String s3 =new String("hello");
        String s4=new String("hello");
        String s5=new String("Hello");  //3

              // == comparision -->string- this check the loacation ref

//        System.out.println(s1==s3);
//        System.out.println(s2==s4);
        System.out.println(s1==s2);
        System.out.println(s3==s4);




  //equal(content)-value
        //how can i check the value ?equal== vaue

        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equalsIgnoreCase(s5));












    }
}
