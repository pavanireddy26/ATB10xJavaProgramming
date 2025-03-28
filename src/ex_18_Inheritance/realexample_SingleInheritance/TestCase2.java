package ex_18_Inheritance.realexample_SingleInheritance;

public class TestCase2 extends commonTOAllTest{
    void runningTC2(){
        startBrowser();
        readExcelFile();
        realDateBaseFile();
        System.out.println("running TC2");
        closeBrowser();
    }
}
