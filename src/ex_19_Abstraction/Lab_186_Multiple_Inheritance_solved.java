package ex_19_Abstraction;

public class Lab_186_Multiple_Inheritance_solved {
    public void main(String[] args) {
        Child1 child1 = new Child1();  // ✅ This will now work
         child1.money();
    }
    class Child1 implements Father1,Mother1{

        @Override
        public void money() {
            System.out.println("only 1 money");
        }

        @Override
        public void m1() {
            System.out.println();
        }

        @Override
        public void f1() {
            System.out.println();
        }
    }

interface Mother1{
    void money();
    void m1();
}

interface Father1{
    void money();
    void f1();


    default void ff(){
        System.out.println(" this is allowed");
    }

    }}
