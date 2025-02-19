package ex_13_Strings;

public class Lab_138_StringFunctions {
    public static void main(String[] args) {

    String name = "Sonal";
//    System.out.println(name.length());
//
//        chatAt
//        System.out.println(name.charAt(2));
//
//        contain
//        System.out.println(name.contains("dy"));
//
//        equals
//        System.out.println(name.equals("sonal"));
//
//        equalIgnorecase
//        System.out.println(name.equalsIgnoreCase("Sonal"));
//
//        indexOf =Returns the index within this string of the first occurrence of the specified character.
//        System.out.println(name.indexOf('o'));
//
//
//        String s1 ="madam";
//        System.out.println(s1.indexOf('m'));
//
//
//        replace
//        System.out.println(name.replace('n' ,'N'));
//
//        split
//        String name4="Sonal Harshi";
//       String[] split =name4.split(" ");
//        System.out.println(split[0]);
//        System.out.println(split[1]);
//
      //   substring  0 to n-1
//        System.out.println(name.substring(1,3));
//        String ss="hamburger";
//        System.out.println(ss.substring(4,10));
//
//        toLowercase
//        System.out.println("SONAL".toLowerCase());
//
//        toUppercase
//        System.out.println("hello".toUpperCase());
//
//         startsWith()
//        System.out.println(name.startsWith("S"));
//
//        endsWith()
//        System.out.println(name.endsWith("a"));
//
//        trim()
//        String name3= "   Sonal Harish    ";
//        System.out.println(name3.trim());
//
//        compareTo()
//        System.out.println(name.compareTo("Sonal"));
//
//        compareToignorecase()
//        System.out.println(name.compareToIgnoreCase("sonal"));
//


 StringBuilder stringBuilder = new StringBuilder("Sonal");
 stringBuilder.append("Patel");
        System.out.println(stringBuilder);



        StringBuilder sb = new StringBuilder("Hi ");
        sb.append("Its my world");
        System.out.println(sb.toString());











    }
}
