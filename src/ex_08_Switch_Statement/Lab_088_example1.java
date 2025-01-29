package ex_08_Switch_Statement;

import java.util.Scanner;

public class Lab_088_example1 {
    public static void main(String[] args) {


     // interview ask wher do we use switch
        //   Web Automation
        //   I will ask user which browser you want me to run the code
        //   chrome -- excute chrome
        //   firefox -- excute of firefox
        //   edge -- edge browser cases



        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = sc.next();

        switch(browser){

            case "chrome" :
                System.out.println("starting a chrome");
                //Future code to start firefox
                //Webdriver driver = new chrome(); //selenium
                break;

            case "firefox":
                    System.out.println("starting a firefox");
                    break;
            case "edge":
                System.out.println("Starting a edge");
                break;
            default:
                System.out.println("I have no idea which browser is ");














        }





















    }
}
