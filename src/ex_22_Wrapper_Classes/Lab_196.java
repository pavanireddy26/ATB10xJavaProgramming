package ex_22_Wrapper_Classes;

public class Lab_196 {
    public static void main(String[] args) {



        int a =10;
        Integer b =a; //Boxing  - int ->Integre -Jvm AutoBoxing
        //Autoboxing  - a will not have attributes and behaviour
        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 =42;
        int v=a2; //unboxing -
        System.out.println(v);
    }
}
