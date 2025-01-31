package ex_09_ForLoops;

public class Lab_107_Even_Odd_50 {
    public static void main(String[] args) {
        // TO find even and odd 1 to 50
        for (int i=0;i<=50;i++){
            if(i%2 ==0){
                System.out.println("even ->" +i);

            }
            else{
                System.out.println("odd ->" +i);
            }
        }
    }
}
