package ex_14_Arrays;

public class Lab_155_2d_Array_Iterate_ForLoop {
    public static void main(String[] args) {

        int[][] matrix ={{1,2,3} ,{4,5,6} ,{7,8,9}};
        //3x3
        //row=3
        //colum=3
        //1,2,3
        //4,5,6
        //7,8,9

        for(int i=0; i <matrix.length ; i++){    // length is nothing but row
            for(int j=0 ;j <matrix[i].length ;j++){
                System.out.print(matrix[i][j] + "|");
            }
            System.out.println();
        }














    }
}
