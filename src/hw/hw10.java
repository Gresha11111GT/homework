package hw;

import java.util.Arrays;

public class hw10 {
    public static void main(String[] args) {
        String str = "hello world";
        String str_1 = "abccba";
        System.out.println(tk_1(str));
        System.out.println(tk_2(str));
        System.out.println(tk_3(str_1));
        System.out.println(tk_4(str));
        System.out.println(Arrays.toString(tk_5(str)));
    }
    public static String tk_1(String str) {
        String str1 = "";
        for (int i = str.length(); i > 0; i--) {
            str1 += str.charAt(i - 1);
        }
        return str1;
    }
    public static int tk_2(String str) {
        int count = 0;
        String[] letters = str.split("");
        for (int i = 0; i < str.length(); i++) {
            if (letters[i].equals("a") || letters[i].equals("e") || letters[i].equals("i") || letters[i].equals("o") || letters[i].equals("u")){
                count++;
            }
        }
        return count;
    }
    public static boolean tk_3(String str) {
        int num = 0;
//        System.out.println(num/2);
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) == str.charAt(len-i-1)){
                num++;
            }
        }
        return num == len / 2;
    }
    public static String tk_4(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (result.indexOf(symbol) == -1) {
                result += symbol;
            }
        }
        return result;
    }
    public static String[] tk_5(String str){
        return str.split(" ");
    }
}

