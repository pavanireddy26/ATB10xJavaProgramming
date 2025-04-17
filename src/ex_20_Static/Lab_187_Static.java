package ex_20_Static;

public class Lab_187_Static {
    public static void main(String[] args) {
        Student s1 = new Student(23);
        Student s2= new Student(33);

        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(Student.course_name);
        Student.m1();
    }


}



class Student{
    int age; //non static- does not have keyword which is called non static
    static String course_name="ATB"; // class loader



    public Student(int age_c){
        this.age =age_c;
    }
    static void m1(){
        System.out.println(" iam  static method");
    }





}