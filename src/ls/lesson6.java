package ls;

public class lesson6 {
    public static void main(String[] args) {
        int[][] ar1 ={
                {1, 2, 3},
                {4,5,6},
                {7,8,9}};
        int[] a = {1, 2, 3};
        System.out.println();
        sumRight(ar1);
    }

    public static void task1(int[][] ar, int num) {
        int isBigger = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (ar[i][j] > num) {
                    isBigger = 1;
                    break;
                }
            }

            if (isBigger == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
    public static void sumRight(int[][] ar){
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length; j++) {
                if (i == 0 || j == ar[i].length - 1)
                    sum+=ar[i][j];

            }

        }
        System.out.println(sum);
    }
}
