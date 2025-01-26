package ex_06_Increment_Decrement_Operator;

import static java.lang.Integer.parseInt;

public class Lab_075_Task5_UserInput {
    public static void main(String[] args) {
       // Take a user input 2 numbers from the arguments and calculate the maximum in between with ternary operator.

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);


        int max = (a>=b) ? a : b;
        System.out.println("max number: " + max);

    }
}
