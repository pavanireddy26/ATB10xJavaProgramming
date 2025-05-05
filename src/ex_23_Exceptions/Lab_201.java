package ex_23_Exceptions;

public class Lab_201 {
    public static void main(String[] args) {

        int c = 0;
        int b= 0;
        try {
            b=10/c;
        } catch (Exception e) {
            System.out.println(e.getMessage());        }
        System.out.println(b);

    }
}
