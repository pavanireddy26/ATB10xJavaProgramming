package ex_23_Exceptions;

public class Lab_206 {
    public static void main(String[] args) {
        try {
            String ip = args[0];          //java.lang.ArithmeticException : /by zero
            int a = Integer.parseInt(ip);        // java.lang.NumberFormatException: For input string: "pavani"
            int b = 100 / a;         // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }









    }
    }

