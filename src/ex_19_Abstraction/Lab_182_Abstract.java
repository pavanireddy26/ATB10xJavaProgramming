package ex_19_Abstraction;

public class Lab_182_Abstract {
    public void main(String[] args) {
   Child c = new Child();
   c.loan50k();
   c.loan25k();
    }
//Father f1 =new Father(); // abstract classes dont have any object

    //abstract class-


   abstract class Father{
      abstract   void loan50k();
      void loan25k(){
          System.out.println("Given 20k");
      }

    }

    class Child extends Father{

        @Override
        void loan50k() {
            System.out.println("Child will pay the loan");
        }
    }






















}
