package ex_19_Abstraction;

public class Lab_185_Interface_P2 {
    public static void main(String[] args) {

        p  p = new p();
        p.icm1();
        p.icm2();
    }
}

class p implements I1{

    @Override
    public void icm1() {
        System.out.println("Icm Complete");
    }

    @Override
    public void icm2(){
            System.out.println("Icm2 Complete");

    }
}
interface I1 {
    void icm1();

    void icm2();
}
interface I2{
    void icn3();
}

