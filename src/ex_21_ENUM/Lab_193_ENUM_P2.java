package ex_21_ENUM;

public class Lab_193_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if( URLS.katalon.equals("katalon")){
            System.out.println("I want to do something");
        }
    }
}


enum URLS{
    ggogle,restassured,katalon
}