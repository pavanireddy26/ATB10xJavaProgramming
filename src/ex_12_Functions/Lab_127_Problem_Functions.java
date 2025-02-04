package ex_12_Functions;


import java.util.Scanner;

public class Lab_127_Problem_Functions {
    public static void main(String[] args) {


        // Create a function of sub,mul, sum, div
        // with parameters a,b(take the prarameter from the  user)





        //Logic building
//        step1 -input /output
//                a,b-int ->scanner
//                int ->variable


//        step2 rough logic
//                functions -type 4th witj return and with paramter
//
      //  step3 write the code and fix ->edge case






            Scanner sc =new Scanner(System.in);
        System.out.println("enter the num1");
        int a =sc.nextInt();
        System.out.println("enter the num2");
        int b=sc.nextInt();


        int result_sum =sum(a,b);
        int result_sub =sub(a,b);
        int result_mul =mul(a,b);
        int result_div =div(a,b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);

        System.out.println(result_div);







    }
        static int sum( int a, int b){
            return a + b;

        }

        static int sub ( int a, int b){
            return a - b;

        }
        static int mul ( int a, int b){
            return a * b;

        }
        static int div ( int a, int b){
            if(b==0){
                System.out.println("div is zeo not allowed");
            }
            return a / b;

        }

    }


