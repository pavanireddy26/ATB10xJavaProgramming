package Practice_Problem_DSA;

public class Practical6_Operators {
    public static void main(String[] args) {
        //OR AND

        int arr[] = {1, 3, 5, 9, 15, 12, 1};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            System.out.println(temp);
            if (temp % 2 == 0 || temp % 3 == 0) {
                count++;
            }
        }

        System.out.println(count);

        //AND

        int arr1[] = {1, 3, 5, 9, 15, 12, 1};
        int count1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            int temp = arr1[i];
            System.out.println(temp);
            if (temp % 2 == 0 && temp % 3 == 0) {
                count1++;
            }
        }

        System.out.println(count1);


    }

    }

