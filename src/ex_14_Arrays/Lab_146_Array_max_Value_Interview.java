package ex_14_Arrays;

public class Lab_146_Array_max_Value_Interview {
    public static void main(String[] args) {


        //find the max value  , min value


        int[] array = {25, 14, 56, 36, 56, 77, 18, 29, 49};

        //logic building formula

        // input- array--int
        //o/p = int == 77max

        int max_output =give_max(array);
        System.out.println(max_output);


    }       static int give_max(int[] array) {

            //Logic
            int max = array[0];//25
            for (int i=0; i < array.length ; i++){
            if(array[i] > max) {
                max = array[i];
            }

        
        }
        return max;
                     }
                     }

