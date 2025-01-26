package ex_05_TernaryOperator;

public class Lab_057_Interview_TO_Nested_Ternary {
    public static void main(String[] args) {
        //  Nested Ternary
        // result = Condition1 ? expression2 : ( condition 2 ? expression 2: expression 3);
       // nested ternary is reduced the code like reduced no of lines


        int number = 15;
        String result =(number > 10) ?(number > 20? "G > 20" : "B 10 to 20") :"B";
        // (number > 20? "G > 20" : "B 10 to 20") --->B 10 to 20
        // now it replace with B 10 to 20 condition
        //String result =(number > 10) ? "B 10 to 20" :"B";
        System.out.println(result);
















    }
}
