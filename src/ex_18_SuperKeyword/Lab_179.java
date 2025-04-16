package ex_18_SuperKeyword;

public class Lab_179 {
    public static void main(String[] args) {
 Car c1= new Car(100);
 c1.display();
    }
}
//single inheritance
class Car extends vehicle {
    private int maxSpeed = 281;


    Car() {
        super(100);
    }
    void test(){

}
    Car(int a){
        System.out.println("PC Car");
    }

    @Override
    void display() {
        System.out.println("override -car");
        System.out.println(super.maxspeed); //180 parent mas
        System.out.println(this.maxSpeed); //281
        this.test();
        super.notest();
    }
}
class vehicle {
    public int maxspeed = 180;

   void notest(){}

    vehicle(){
        System.out.println("Default Constructor");
    }
    vehicle(int a){
        System.out.println("param constructor");
    }
    //method overloading- same ,same name functions with diffrenet arugument
    void message(){
        System.out.println("No return, No Aruguments");
    }

    void message(int a){
        System.out.println("PC - Arguement");
    }

    void display(){
        System.out.println("vehicle parent");
    }
}