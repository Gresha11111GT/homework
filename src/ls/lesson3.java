package ls;

public class lesson3 {

    public static void main(String[] args) {
        ex_1();
        ex_2();
        ex_3();
        ex_4();
        ex_5();
        System.out.println("я потім ще зроблю доп. завдання.");
    }
    public static void ex_1(){
        System.out.print("ex_1 - ");
        for(int i = 1; i < 110; i+=2){
            System.out.print(i+" ");
        }
    System.out.println(" ");
    }
    public static void ex_2(){
        System.out.print("ex_2 - ");
        for(int i = 90;i > 0; i-=5){
            System.out.print(i+" ");
        }
    System.out.println(" ");
    }
    public static void ex_3(){
        System.out.print("ex_3 - ");
        for(int i = 2; i < 40; i*=2) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void ex_4() {
        System.out.print("ex_4 - ");
        for (int i = -29; i < 10; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");
    }
    public static void ex_5() {
        System.out.print("ex_5 - ");
        int sum =  0;
        int par = 0;
        for(int i = 50; i<150; i++) {
            sum+= i;
            if (i % 2 == 0){
                par++;
            }
        }
        System.out.print("сумма = "+sum+". кіл. парних = "+par);
    }
}