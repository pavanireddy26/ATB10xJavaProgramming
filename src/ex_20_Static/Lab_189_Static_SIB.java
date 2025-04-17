package ex_20_Static;



public class Lab_189_Static_SIB {
    public void main(String[] args) {
         A a =new A();

    }


class A{
        static{
            //System.out.println("Called SIB");
            System.out.println("Called only once when class is loaded");
            System.out.println("you can wrir=te a code reading a excel file,database");
        }

        static int a =10;
        static void m1(){
            System.out.println("static function");
        }


}










}
