package ex_11_DoWhileLoop;

import java.util.Scanner;


public class Lab_120_Task2_vowels {
    public static void main(String[] args) {
        // Q -Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4

             Scanner sc=new Scanner(System.in);
             String  a = "pramod";
             for( int i = 0; i < a.length();i++) {
                 char ch = a.charAt(i); // Get the current character

                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                     System.out.println(ch + " is a vowel.");
                 } else {
                     System.out.println(ch + " is a consonant.");
                 }
             }}}































