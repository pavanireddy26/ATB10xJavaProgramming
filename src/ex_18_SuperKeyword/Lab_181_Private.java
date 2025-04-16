package ex_18_SuperKeyword;

public class Lab_181_Private {
}
class XYZ{
    public int my_gold =10;
    //private int my_gold =10;

}
 class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);
    }
 }