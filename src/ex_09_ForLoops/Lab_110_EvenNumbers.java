package ex_09_ForLoops;

public class Lab_110_EvenNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <=50; i++) {
            if(i%2==0){

                System.out.println("even ->"+i);
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
