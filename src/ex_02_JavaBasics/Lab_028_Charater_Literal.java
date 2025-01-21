package ex_02_JavaBasics;

public class Lab_028_Charater_Literal {
    public static void main(String[] args) {


    //char
    char c1='A';
    char c2='C';
    char c3='@';
   // char c4 ="B" //string
        char c5='8';
        char c6= ' ';
        char c7= '(';



    //Escape char
    char new_line='\n';
    char tab_line='\t';
    char back_space='\b';
    char carriage_return='\r';

        System.out.println("pavani"+ new_line +"reddy");
        System.out.println("pavani"+"reddy");
        System.out.println("pavani"+ tab_line +"reddy");
        System.out.println("pavani"+ back_space +"reddy");
        System.out.println("pavani"+ carriage_return +"reddy");



        char c11 ='\u1F60';
        //ASCII--->(Limited number)A--> 65
        //UNICODE (INDIA ,JAP,CHINA) - rupee -
        //   /u09878

        char rupee ='₹';
        System.out.println("pavani has  "+rupee+10);
        char my_laugh_smily  ='\u1f60';
        System.out.println(my_laugh_smily);


}
}
