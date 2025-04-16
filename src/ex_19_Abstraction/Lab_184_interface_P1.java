package ex_19_Abstraction;

public class Lab_184_interface_P1 {
    public static void main(String[] args) {
       Car car1= new Car();
       car1.drive();

    }
}

class Car implements Engine1,Brakes{
  void drive(){
      startEngine();
      applyBreaks();
      stopEngine();
  }
    @Override
    public void applyBreaks() {
        System.out.println("apply brake");
    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine");
    }
}
 interface Engine1{
    void startEngine();
    void stopEngine();
 }
 interface Brakes{
    void applyBreaks();
 }