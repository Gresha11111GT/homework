package hw;

import java.util.Arrays;

public class hw7 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 2, 9, 5, 1, 8, 7, 4};
        sort(arr);
    }
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 1; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}