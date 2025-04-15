package ex_18_Polymorphism.MethodOverriding;

public class Lab_173 {
    public static void main(String[] args) {
            Pramod p = new Pramod();
            p.home();

            Father f1 =new Father();
            f1.home();

            Father f2 = new Pramod(); //dynamic dispatch
            f2.home();  //method overriding -riden the father method

        //Pramod p3 = new Father  -reverse not possible
    }
}
