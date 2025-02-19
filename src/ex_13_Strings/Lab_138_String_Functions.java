package ex_13_Strings;

public class Lab_138_String_Functions {
    public static void main(String[] args) {

        String str1 ="Hello"; //scp
   String str2 ="Hello";  // there are 1 string,refrences=2
    String str3=new String("Hello") ; //oject area =1


        System.out.println(str1==str2);    //1

        System.out.println(str1=str3);
        System.out.println(str1.equals((str3))); // true ,because the content is the same










    }
}
