package ex_09_ForLoops;

public class Lab_109_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if(i==5){
                continue; // skip the below code move to tp
            }
            System.out.println(i);
        }
    }
}
