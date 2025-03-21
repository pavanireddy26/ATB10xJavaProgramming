package ex_16_Constructor;

public class Lab_163_OOPS {
    public static void main(String[] args) {
    Baby b1 =new Baby();

   }
  }

   class Baby {
   String name;


  // default constructor also called
   Baby() {
       System.out.println("I  am called ,object is created");
   }
  //Instance initialization block
       {
           System.out.println("Step 1 - Called database before working");

       }




    }


