package ex_23_Exceptions;

public class Lab_208_Exception {
    public static void main(String[] args) {

        try {
            String ip = args[0];          //java.lang.ArithmeticException : /by zero
            int a = Integer.parseInt(ip);        // java.lang.NumberFormatException: For input string: "pavani"
            int b = 100 / a;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
