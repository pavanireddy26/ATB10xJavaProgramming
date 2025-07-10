package Practice_Problem_DSA;

public class Practical8_Reverse_A_String {
    public static void main(String[] args) {

        String s= "Chapri";
//        System.out.print(s.charAt(5));
//        System.out.print(s.charAt(4));
//        System.out.print(s.charAt(3));
//        System.out.print(s.charAt(2));
//        System.out.print(s.charAt(1));
//        System.out.print(s.charAt(0));

        String ans = "";
     for(int i=5 ;i>=0;i--){
     ans=ans+(s.charAt(i));
     }
        System.out.println(ans);

















    }
}
