package ex_22_Wrapper_Classes;


public class Lab_Wrapper_Conversion {
    public static void main(String[] args) {
       String num = "10" ;
       //String -> wrapper conversion
       Integer a = Integer.parseInt(num); //wrapper


       //String to primitive
       int a3 = Integer.parseInt(num);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        Integer aa =Integer.parseInt("10");
        System.out.println(aa);
    }
}
