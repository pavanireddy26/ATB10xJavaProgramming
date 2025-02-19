package ex_13_Strings;

public class Lab_140_StringBuilder_StringBuffer {
    public static void main(String[] args) {


        //String ->90%
        //srtingBuilder- >5-7%(thread safty -we avoid it)
        //Thread Local ->multithreading ->



        StringBuffer stringBuffer = new StringBuffer("promod");

        stringBuffer.append("Dutta");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);


        StringBuilder stringBuilder = new StringBuilder("pramod");
        stringBuilder.append("sharma");
        System.out.println(stringBuilder);
        stringBuilder.append("world");
        System.out.println(stringBuilder);



       String s1="Hello";
       String s2="world";
       String s3= s1+s2;// Creates a new string "Hello World!"
        System.out.println(s3);// output - Hello world

        System.out.println(s1);














    }
}
