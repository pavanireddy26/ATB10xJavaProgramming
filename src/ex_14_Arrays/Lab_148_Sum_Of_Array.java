package ex_14_Arrays;

    public class Lab_148_Sum_Of_Array {
    public static void main(String[] args) {


       int[]  number ={12,34,10};
       int sum=0 ;// ==>12+34+10=56

//        for(int i=0;i < number.length;i++){
//            sum=sum+number[i];
//        }

//        System.out.println(sum);

           //we can also use  For Each Loop
        System.out.println(" ------------");
        for(int n: number){
            sum = sum+n;
        }

        System.out.println(sum);



    }
}
