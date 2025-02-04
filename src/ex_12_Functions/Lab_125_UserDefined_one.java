package ex_12_Functions;

import org.w3c.dom.ls.LSOutput;

public class Lab_125_UserDefined_one {
    public static void main(String[] args) {


//    User Defined Functions.**
//1. Without Parameters and Without Return Type.
//2. Without Parameters but With Return Type
//3. With Parameters and Without Return Type
//4. With Parameters and With Return Type


        //1. Without Parameters and Without Return Type.

//       // greet();
        //2. Without Parameters but With Return Type
//        String s= "Hi,how are you";
//        System.out.println(s);
//        int age_to_vote_person = age_to_vote();
//        System.out.println("age to vote is -> "+ age_to_vote_person);

        //3. With Parameters and Without Return Type (90% we use)

                 //  greet_with_name("pavani");   }

                //  greet_with_name("pavani ","reddy");

                 //greet_with_details("pavani",26 ,80000);
        //4. With Parameters and With Return Type
      //int sum= sum_of_two_number(3,6);
        int sum1=sum_of_three_number(6,25,6);
        System.out.println(sum1);
    }
    //1. Without Parameters and Without Return Type.

//         static void greet(){
//         System.out.println("Hi");


    //2. Without Parameters but With Return Type

//         static String greet_with_hello(){
//         return "Hi,how are you" ;
//          }

//         static int age_to_vote() {
//         return 18;
//    }


//    //3. With Parameters and Without Return Type
//                  static void greet_with_name(String name){
//                  System.out.println("Hi , your name is :"+name);
//      }


       //4. With Parameters and With Return Type
//            static int sum_of_two_number(int a ,int b) {
//                return a + b;
//                {
                    static int sum_of_three_number(int a, int b, int c){
                    return a + b + c;
                }
                }

