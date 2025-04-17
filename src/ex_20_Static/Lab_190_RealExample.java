package ex_20_Static;

import static ex_20_Static.Student.course_name;
//
//public class Lab_190_RealExample {
//    public static void main(String[] args) {
//        ATB1 obj = new ATB1();  // To trigger IIB
//        obj.readDocuments();    // Call non-static method
//        ATB1.doAssignment();    // Call static method
//   }
//}
//class ATB1{
//    {
//        System.out.println("IIB-this is called when object is created");
////        //what is the purppose?
////        here you can write code related
////            start a website or anything before starting the web automation or api automation
//    }
//    static{
//        System.out.println("Load the class?, i will execute");
//    }
//    private String name;
//
//    public static String getCourse_name() {
//        return course_name;
//    }
//
//    public static void setCourse_name(String course_name) {
//        ATB1.course_name = course_name;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    private String Name;//non static
//
//    private String phone; //non static
//    static String course_name ="ATB";
//}
//void readDocuments(){
//    System.out.println("Non Static method");
//    System.out.println(course_name);
//}
//static void doAssignment(){
//    //System.out.println(phone); // static metgod can not access static variables
//    System.out.println("DoAssignment");
//}
//}