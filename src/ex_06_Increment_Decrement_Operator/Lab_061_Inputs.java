package ex_06_Increment_Decrement_Operator;

public class Lab_061_Inputs {
    public static void main(String[] args) {

        // Take inputs from user (command line) -- click arrow in the top and select edit confirguation enter number and click apply and ok



        String age_string = args[0];
        int age = Integer.parseInt(age_string);  // convert string to interger
        System.out.println(age);
        System.out.println(args[1]); //100
        System.out.println(args[2]); //56
        System.out.println(args[3]); //87

        String canIGoGoa =age >24 ? "yes" :"No";
       System.out.println(canIGoGoa);
    }
}
