package Practice_Problem_DSA;

public class Practical9_Palindrome {
    public static void main(String[] args) {
        String s = "abccba";

        String ans = "";
        for (int i =s.length()-1; i >= 0; i--) {
            ans = ans + s.charAt(i);
        }

        if (ans.equals(s)) {
            System.out.println("yes palindrome");
        } else {
            System.out.println("no palindrome");
        }
    }
}
