package ex_19_Abstraction;

public class Lab_189 {
    public static void main(String[] args) {
        pramod d = new Dutta(); //dynamic dispatch with interface
        d.display();
    }
}


class  Dutta implements pramod{

    @Override
    public void display() {
        System.out.println(a);
    }
}
interface pramod{
    int a =10;
    void display();
}