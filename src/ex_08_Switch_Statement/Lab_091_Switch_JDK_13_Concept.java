package ex_08_Switch_Statement;

public class Lab_091_Switch_JDK_13_Concept {
    public static void main(String[] args) {

        //jdk >13
        int itemcode =001;

       switch(itemcode){
           case 001,002,004:
               System.out.println("All of the aee electronic ");
               break;
           case 005,006,007:
               System.out.println("this is mech");
               break;
           default:
               System.out.println("None");

       }
    }
}
