package ex_05_TernaryOperator;

public class Lab_059_Interview_Three_Max_Number {
    public static void main(String[] args) {

        // finding the  largest Number ,n1 ,n2,n3  ==>max(n1,n2,n3)

        // step1 : Find inputs/output
        //n1,n2,n3 ==> datatype -> int
        // output -> int
        // 100,34,20 => 100 largest



        // step 2 :rough logic
        //  n1 >= n2 ->Y1 : N1
        //  Y1 -> n1 >= n3 :Y(n1) : N(n3)
        //  N1 -> n2 > n3 : Y(n2) : N (n3)




//     int n1=2 , n2 = 9, n3= -11;
//        int largest =(n1  >= n2)? ((n1 >= n3) ? n1:n3) :((n2 >= n3) ? n2 :n3);
//
//         System.out.println("Largest Number:" + largest);

        // 100,34,10 => 100 largest  example

        int n1=100, n2 = 34, n3= 10;
        int large = (n1 >= n2) ? ((n1 >=n3) ? n1 : n3)  : ((n2 >= n3) ?n2 :n3);
        System.out.println("large Number : "+large);











    }
}
