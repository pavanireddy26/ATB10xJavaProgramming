package ex_17_OOPs_Part2;

public class Lab_169_Parameter_Constructor {
    public static void main(String[] args) {
        Mobile iphone=new Mobile("iphone","2008");
        Mobile oneplus=new Mobile("oneplus","2016");
        System.out.println(iphone.model_name);
        System.out.println(oneplus.model_name);
        System.out.println(iphone.year_of_launch);
        System.out.println(oneplus.year_of_launch);

        iphone.display();

        String model_name_main=iphone.give_me_model_name();
        System.out.println(model_name_main);
    }
}


class Mobile{
    String model_name;
    String year_of_launch;

    Mobile(String model_name_c,String year_of_launch_c){
        this.model_name=model_name_c;
        this.year_of_launch=year_of_launch_c;
    }
    void display(){                     //no return type its only print
        System.out.println(this.model_name + "_"+ this.year_of_launch);
    }

    String give_me_model_name(){
     return this.model_name;


     // note: its same template bt act as diffferent
}}