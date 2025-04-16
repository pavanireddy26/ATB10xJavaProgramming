package ex_19_Abstraction;

public class Lab_187_Interviewquestion {
    public static void main(String[] args) {

    }
    interface I11{}


    interface I12{}
     class A1{}

    class B1{}
    class Test1 extends A1{}
  //  class Test2 extends A1,B1{} // multiple inheritance in class is not allowed
    class Test3 implements I11{}
   class Test4 implements I12,I11{}
class Test5 extends A1 implements I11,I12{}

// class Test5 implments I11 extends A{} -nt possible

interface I3{}
//interface I3 extends A1{}




}
