package Practice_Problem_DSA;

public class Practical5_Problem1 {
    public static void main(String[] args) {
        int arr[] ={1,3,4,5,18,2,1,1};
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count =count+1;//count++
            }
        }
        System.out.println(count);
    }
}
