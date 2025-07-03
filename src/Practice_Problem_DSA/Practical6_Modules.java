package Practice_Problem_DSA;

public class Practical6_Modules {
    public static void main(String[] args) {

//
        //divided by 3
        int arr[] = {1,3,5,9,15,12,1};
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println(temp);
            if(temp%2 == 0){
                count++;
            }
        }

        System.out.println(count);
    }

}
