package ex_18_Polymorphism.Methodoverloading;

public class Lab_172_MethodOverloading {
    public static void main(String[] args) {
        Lab_171_MathOperations m1 =new  Lab_171_MathOperations();
     int r= m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4,5);
        System.out.println(r1);



//
//      double r0 = m1.add(3.34 ,4.56);
//        System.out.println(r1);





    }


}
