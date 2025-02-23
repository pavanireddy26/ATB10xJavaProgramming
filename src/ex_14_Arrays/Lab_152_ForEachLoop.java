package ex_14_Arrays;

public class Lab_152_ForEachLoop {
    public static void main(String[] args) {

        int[] a= new int[3];
        a[0] =90;
        a[1]=92;
        a[2]=99;


//        for(int i=0;i<a.length ;i++){
//            System.out.println(a[i]);
//        }

         //  we can also use foreach loop

         for(int i:a){
             System.out.println(i);

        }



       // if we have  string array

        String[] names= {"pavani" ,"reddy","putti"};

         for(String name :names){
             System.out.println(name);

         }










    }
}
