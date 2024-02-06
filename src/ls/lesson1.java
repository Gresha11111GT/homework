package ls;

public class lesson1 {
    public static void main(String[] args) {
        task_1(1);
        task_1(0);
        task_1(-3);

        task_2(1);
        task_2(0);
        task_2(-3);

        task_3(1);
        task_3(0);
        task_3(-3);

        task_4(1);
        task_4(0);
        task_4(-3);

        task_5(1);
        task_5(0);
        task_5(-3);

        task_6(1);
        task_6(0);
        task_6(-3);

        task_7("test");
        task_7("тест");
        task_7("3");

        task_8("1");
        task_8("1");
        task_8("3");

        task_9_1(true);
        task_9_1(false);

        task_9_2(true);
        task_9_2(false);

        task_10_1(true);
        task_10_1(false);

        task_10_2(true);
        task_10_2(false);

        task_11(5);
        task_11(0);
        task_11(-3);
        task_11(2);

        task_12(5);
        task_12(0);
        task_12(-3);
        task_12(2);

        task_13(1, 3);
        task_13(0, 6);
        task_13(3, 5);
//task_14 (примеров нет, придумаю свои)

        task_14(0, 3);
        task_14(3, 1);
        task_14(-7, 10);
        task_14(5, 9);

        task_15(1);
        task_15(2);
        task_15(3);
        task_15(4);

    }

    public static void task_1(int a) {
        if (a == 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_2(int a) {
        if (a > 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_3(int a) {
        if (a < 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_4(int a) {
        if (a >= 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");

        }
    }

    public static void task_5(int a) {
        if (a <= 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_6(int a) {
        if (a != 0)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_7(String a) {
        if (a == "test")
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_8(String a) {
        if (a == "1")
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_9_1(boolean test) {
        if (test)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_9_2(boolean test) {
        if (test == true)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_10_1(boolean test) {
        if (!test)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_10_2(boolean test) {
        if (test != true)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_11(int a) {
        if (a > 0 && a < 5)
            System.out.print("Вірно ");
        else {
            System.out.print("Невірно ");
        }
    }

    public static void task_12(int a) {
        if (a == 0 || a == 2) {
            a = a + 7;
            System.out.print(a);
        } else {
            a = a / 10;
            System.out.print(a);
        }
    }

    public static void task_13(int a, int b) {
        if (a <= 1 && b >= 3) {
            System.out.print(a + b);
        } else {
            System.out.print(a - b);
        }
    }

    public static void task_14(int a, int b) {
        if (a > 2 && a < 11 || b >= 6 && b <= 14)
            System.out.print("Вірно");
        else {
            System.out.print("Невірно");
        }
    }

    public static void task_15(int num) {
        switch (num) {
            case 1:
                String result = "Зима";
                break;
            case 2:
                result = "Весна";
                break;
            case 3:
                result = "Лето";
                break;
            case 4:
                result = "Осінь";
                break;
        }
    }

    public static void task_16(int day) {
        if (day > 1 && day <= 10) {
            System.out.print("Перша");
        } else if (day > 10 && day <= 20) {
            System.out.print("Друга");
        } else if (day > 20 && day <= 30) {
            System.out.print("Третя");
        } else if (day == 31) {
            System.out.print("Четверта");
        }
    }
    public static void task_17 (int month) {
        if (month > 0 && month <= 2 || month == 12) {
            System.out.print("Зима");
        } else if (month > 2 && month <= 5) {
            System.out.print("Весна");
        } else if (month > 5 && month <= 8) {
            System.out.print("Літо");
        } else if (month > 8 && month <= 11) {
            System.out.print("Осінь");
        }

    }
}