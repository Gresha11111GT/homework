package hw;

import java.util.Arrays;

public class hw6 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        t1(arr);
        t2(arr);
        t3(arr);
        t4(arr);
        t5(arr);
        t6(arr);
        t7(arr);
        t8(arr);
        t9(arr);
        t10(arr);
        t11(arr);
        t12(arr2);
        t13(arr);
        t14(arr, 5);
        t15(arr);
//        test(arr);
    }


//    public static void test(int[][] arr){
//        System.out.println(Arrays.deepToString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
//    }


    public static void t1(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                sum += arr[j][i];
            }
        }
        System.out.println(sum);
        System.out.println(" ");
    }

    public static void t2(int[][] arr) {
        int sum = 0;
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                k++;
                sum += arr[j][i];
            }
        }
        System.out.println((float) sum / k);
        System.out.println(" ");
    }

    public static void t3(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            int k = arr[j][0];
            for (int i = 0; i < arr[j].length; i++) {
                if (k < arr[j][i]) {
                    k = arr[j][i];
                }
            }
            System.out.println(k);
        }
        System.out.println(" ");
    }

    public static void t4(int[][] arr) {
        for (int j = 0; j < arr.length; j++) {
            int k = arr[0][0];
            for (int i = 0; i < arr[j].length; i++) {
                if (k > arr[i][j]) {
                    k = arr[i][j];
                }
            }
            System.out.println(k);
        }
        System.out.println(" ");
    }

    public static void t5(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
        }
        System.out.println(" ");
    }

    public static void t6(int[][] arr) {
        int res = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j][j] < 0) {
                res = 1;
                break;
            }
        }
        if (res == 1) {
            System.out.println("Ні");
        } else {
            System.out.println("Так");
        }
        System.out.println(" ");
    }

    public static void t7(int[][] arr) {
        System.out.println(Arrays.deepToString(arr));
        int[] temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        System.out.println(Arrays.deepToString(arr));
        System.out.println(" ");
    }

    public static void t8(int[][] arr) {
        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[j][i] < 0){
                    for (int k = 0; k < arr.length;k++) {
                        sum+=arr[j][k];
                    }
                    System.out.println(sum);
                    sum = 0;
                    break;
                }
            }
        }
        System.out.println(" ");
    }
    public static void t9(int[][] arr) {
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[j][i]%2 == 0){
                    k++;
                }
            }
        }
        System.out.println(k);
        System.out.println(" ");
    }
    public static void t10(int[][] arr) {
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[j][i]<0){
                    k++;
                }
            }
        }
        System.out.println(k);
        System.out.println(" ");
    }
    public static void t11(int[][] arr) {
        int k = 1;
        System.out.println(Arrays.deepToString(arr));
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[j][i] == 0){
                    arr[j][i] =k;
                    k++;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println(" ");
    }
    public static void t12(int[][] arr) {
        int m = 0;
        int nm = 0;
        for (int j = 0; j < arr.length; j++) {
            m += arr[j][j];
            nm += arr[j][arr.length -1 - j];
        }
        if (m == nm){
            System.out.println("Так");
        }
        else{
            System.out.println("Ні");
        }
        System.out.println(" ");
    }
    public static void t13(int[][] arr) {
        int sum =0;
        for (int j = 0; j < arr.length; j++) {
            sum += arr[j][arr.length - 1 - j];
        }
        System.out.println(sum);
        System.out.println(" ");
    }
    public static void t14(int[][] arr, int target) {
        int k = 0;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[j][i] < target) {
                    k++;
                }
            }
        }
        System.out.println(k);System.out.println(" ");
    }
    public static void t15(int[][] arr) {
        int res =0;
        for (int j = 0; j < arr.length; j++) {
            if(res==0){
                for (int i = 0; i < arr.length; i++) {
                    int f = arr[j][i];
                    for (int l = 0; l < arr.length; l++) {
                        for (int k = 0; k < arr.length; k++) {
                            if(arr[l][k] == f){
                                res++;
                            }
                        }
                    }
                    if(res>1){
                        break;
                    }
                    else{
                        res = 0;
                    }
                }
            }
            else{
                break;
            }
        }
        if (res == 0){
            System.out.println("Так");
        }
        else{
            System.out.println("Ні");
        }
        System.out.println(" ");
    }
}