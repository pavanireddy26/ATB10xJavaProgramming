package ex_15_OOPs;

public class Lab_162_Cats {
    public static void main(String[] args) {
        Cat c1 =new Cat();
        Cat c2= null;      //there is a null area also , which means nothing
        new Cat();

        c1.running();
      //  c2.running();




    }
}
class Cat{
    String name;

    void running(){
        System.out.println("Running");
    }
}

