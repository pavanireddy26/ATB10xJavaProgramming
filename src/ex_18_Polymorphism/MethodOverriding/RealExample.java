package ex_18_Polymorphism.MethodOverriding;

public class RealExample {
    public static void main(String[] args) {
        TC t1 =new TC();
        t1.openBrowser();
        TC2 t2 =new TC2();
        t2.openBrowser();
    }
}

class CommonToAllTC{
    void openBrowser(){
        System.out.println("Open the browser in 5 Sec");
    }
}

class TC extends CommonToAllTC{
    void startS(){
        openBrowser();
    }
}
class TC2 extends CommonToAllTC{
    @Override
    void openBrowser(){
        System.out.println("Open the browser in 2 Sec");
    }
}
