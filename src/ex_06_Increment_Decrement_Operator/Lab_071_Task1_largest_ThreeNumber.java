package ex_06_Increment_Decrement_Operator;

public class Lab_071_Task1_largest_ThreeNumber {
    public static void main(String[] args) {
        int a1 =20;
        int b1= 40;
        int c1 =10;

        int largest=(a1>=b1) ?((a1>=c1)?a1 :c1):((b1>=c1)?b1 :c1);
        System.out.println("largest Number:"+ largest);
    }
}
