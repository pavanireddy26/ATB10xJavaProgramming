package ex_03_Operators;

public class Lab_038_Interview_Concat_plus_Operator {

    public static void main(String[] args) {


     /*   int a= 10;
        int b=20;
        System.out.println(a+b); //math


        String name1="pavani";
        String name2 ="reddy";
        System.out.println(name1+name2);  //concatination

        // + ->behave differently with data type
        // + ->Operator overloading

           */


        String first_name="pavani";
        String last_name ="Reddy";
        int a = 10;
        int b = 10;
        System.out.println(first_name + last_name + (a + b));
         //pavanireddy1010 ->first operator + performed

        System.out.println( a + b + first_name + last_name);
         // first+math -->20pavaniReddy



        //BODMAS  -Bracket of div,mul,add ,sub
    }







}
