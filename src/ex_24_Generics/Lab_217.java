package ex_24_Generics;

public class Lab_217 {
    public static void main(String[] args) {
        temp(23,45);
        temp("pavani","reddy");
        temp(true ,false);
    }
    public static <T> Integer temp(T a, T b){
        System.out.println(a);
        System.out.println(b);
        return null;

    }

    }








