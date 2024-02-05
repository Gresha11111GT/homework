package hw;

public class  hw5 {
    public static void main(String[] args) {
        int_to_str(211919);
        int_to_str(119);
        int_to_str(999999);
    }

    public static void hundred_to_srt(int num) {//
        String s = "";
        String[] base1 = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] base2 = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] base3 = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        if (num > 0 && num < 10)
            s = base1[num];
        else if (num > 19 && num < 100)
            s = base2[num / 10] + " " + base1[num % 10];
        else if (num <= 19 && num >= 10)
            s = base3[num % 10];
        else if (num > 100 && num < 1000) {
            if (num % 100 > 10 && num % 100 < 20) {
                s = base1[num / 100] + " hundred " + base3[num% 10];
            } else {
                s = base1[num / 100] + " hundred " + base2[num / 10 % 10] + " " + base1[num % 10];
            }
        }
        System.out.print(s);
    }

    public static void int_to_str(int num) {
        if(num>=1000){
            hundred_to_srt(num/1000);
            System.out.print(" thousand ");
        }
        hundred_to_srt(num%1000);
        System.out.println(" ");
    }
}
