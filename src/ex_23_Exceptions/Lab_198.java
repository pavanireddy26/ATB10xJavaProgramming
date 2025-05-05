package ex_23_Exceptions;

public class Lab_198 {
    public static void main(String[] args) {

//        int a =0;
//        int b=10;
//        int c= b/a;
//        System.out.println(c);

        //unchecked --> ArithmeticException ,NullPointerException

        //java.lang.ArithmeticException: / by zero - unchecked -Jvm doesnt know

        String name =null;
        name.trim(); //(" pavani ") -> trailing spaces ->"pavani" it wil remove spaces
        //java.lang.NullPointerException: Cannot invoke "String.trim()" because "name" is null  -- unchecked





    }
}
