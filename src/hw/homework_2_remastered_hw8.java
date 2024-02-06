package hw;

public class homework_2_remastered_hw8 {
    public static void main(String[] args) {
        System.out.println(task_1(1));
        System.out.println(task_1(0));
        System.out.println(task_1(-3));
        System.out.println();

        System.out.println();
        System.out.println(task_2(0));
        System.out.println(task_2(-3));

        System.out.println(task_3(1));
        System.out.println(task_3(0));
        System.out.println(task_3(-3));

        System.out.println(task_4(1));
        System.out.println(task_4(0));
        System.out.println(task_4(-3));

        System.out.println(task_5(1));
        System.out.println(task_5(0));
        System.out.println(task_5(-3));

        System.out.println(task_6(1));
        System.out.println(task_6(0));
        System.out.println(task_6(-3));

        System.out.println(task_7("test"));
        System.out.println(task_7("тест"));
        System.out.println(task_7("3"));

        System.out.println(task_8("1"));
        System.out.println(task_8("1"));
        System.out.println(task_8("3"));

        System.out.println(task_9_1(true));
        System.out.println(task_9_1(false));

        System.out.println(task_9_2(true));
        System.out.println(task_9_2(false));

        System.out.println(task_10_1(true));
        System.out.println(task_10_1(false));

        System.out.println(task_10_2(true));
        System.out.println(task_10_2(false));

        System.out.println(task_11(5));
        System.out.println(task_11(0));
        System.out.println(task_11(-3));
        System.out.println(task_11(2));

        System.out.println(task_12(5));
        System.out.println(task_12(0));
        System.out.println(task_12(-3));
        System.out.println(task_12(2));

        System.out.println(task_13(1,3));
        System.out.println(task_13(0,6));
        System.out.println(task_13(3,5));
//task_14 (примеров нет, придумаю свои)

        System.out.println(task_14(0,3));
        System.out.println(task_14(3,1));
        System.out.println(task_14(-7,10));
        System.out.println(task_14(5,9));

        System.out.println(task_15(1));
        System.out.println(task_15(2));
        System.out.println(task_15(3));
        System.out.println(task_15(4));

    }

    public static String task_1(int a) {
        if (a == 0)
            return ("Вірно ");
        return ("Невірно");

    }

    public static String task_2(int a) {
        if (a > 0)
            return ("Вірно ");
        return ("Невірно");

    }

    public static String task_3(int a) {
        if (a < 0)
            return ("Вірно ");
        return ("Невірно");

    }
    public static String task_4(int a) {
        if (a >= 0)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_5(int a){
        if(a <= 0)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_6(int a){
        if(a != 0)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_7(String a){
        if(a == "test")
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_8(String a){
        if(a == "1")
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_9_1(boolean test){
        if(test)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_9_2(boolean test){
        if(test)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_10_1(boolean test){
        if(!test)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_10_2(boolean test){
        if(!test)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_11(int a){
        if(a > 0 && a < 5)
            return ("Вірно ");
        return ("Невірно");
    }
    public static int task_12(int a){
        if(a == 0 || a == 2)
            return a+7;
        return a/10;
    }
    public static int task_13(int a, int  b){
        if(a <= 1 && b >= 3)
            return a+b;
        return a-b;

    }
    public static String task_14(int a, int b){
        if(a > 2 && a < 11 || b >= 6 && b <=14)
            return ("Вірно ");
        return ("Невірно");
    }
    public static String task_15(int num) {
        String result ="";
        switch (num) {
            case 1:
                result = "Зима";
                return result;
            case 2:
                result = "Весна";
                return result;
            case 3:
                result = "Лето";
                return result;
            case 4:
                result = "Осінь";
                return result;
        }
        return result;
    }
}