package List;

public class Lab_230_Student {


        private String name;
        private String rollno;

   public Lab_230_Student(String name) {
            this.name = name;
        }



    public String getName () {
            return name;
        }

        public String getRollno () {
            return rollno;
        }

        public void setRollno (String rollno){
            this.rollno = rollno;
        }

        public void setName (String name){
            this.name = name;
        }


        public void  printDetails(){
            System.out.println("Student Name : "+this.name);
            System.out.println("Student Roll No :"+this.rollno);
        }

    @Override
    public String toString() {
        return "Lab_230_Student{" +
                "name='" + name + '\'' +
                ", rollno='" + rollno + '\'' +
                '}';
    }
}




