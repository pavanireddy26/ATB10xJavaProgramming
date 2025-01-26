package ex_05_TernaryOperator;

public class Lab_060_AgeClassification {
    public static void main(String[] args) {


        int  age =25;

        //adult ,minor,senior
        // senior >65
        //minor <18
        //adult >18


        String result  =(age < 18)? "Minor" :(age < 65)? "Adult":"senior";
        System.out.println(result);










    }
}
