package ex_23_Exceptions;

public class Lab_215_Finally_Not_Executed_Interview {
    public static void main(String[] args) {


        try {
            int a = 10/10;
            System.out.println(a);
        //    System.exit(0);    // it can can only stop the execution of the finally block
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Hello Last");
        }


    }
}
