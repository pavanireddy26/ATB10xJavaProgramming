package ex_04_TypeCasting;

public class Lab_055_TypeCasting_Used {
    public static void main(String[] args) {
        // GST -18.45

        int course =100;
        float GST= 18.45f;
      //  int total_int =course+GST; //Narrowing - implict
       int total_int =course+(int)+GST;   //Narrpow -EXPLICT
        float total =course+GST;  //widening -implict
        float total2 =(float) course+GST;  //widening - explicit
        System.out.println(total);
    }
}
