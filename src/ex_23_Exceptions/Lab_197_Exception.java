package ex_23_Exceptions;

public class Lab_197_Exception {
    public static void main(String[] args) {

        System.out.println("Start the program");
        String ip = args[0];          //java.lang.ArithmeticException : /by zero
        int a = Integer.parseInt(ip);        // java.lang.NumberFormatException: For input string: "pavani"
        int b = 100/a;         // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
        System.out.println(b);
        System.out.println("End the program");


        //java.lang.ArithmeticException : /by zero
        // java.lang.NumberFormatException: For input string: "pavani"
        // java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0







    }
}
