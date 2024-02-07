package hw;
public class hw8 {
    public static void main(String[] args) {
        fibonacci(5);
    }
//    public static int[] fib(int num){
//
//        int[] arr = {0, 1, 1};
//        for (int i = 0; i < num-1; i++) {
//            arr[0] = arr[1];
//            arr[1] = arr[2];
//            arr[2] = arr[0] + arr[1];
//            System.out.println(arr[2]);
//        }
//        return arr;
//    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
    public static void fibonacci (int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}