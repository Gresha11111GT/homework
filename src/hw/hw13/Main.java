package hw.hw13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tk tk = new Tk();
        System.out.println(tk.generateArr(tk.arr, 20));
        System.out.println(tk.sortInc(tk.arr));
        System.out.println(tk.sortDec(tk.arr));
        System.out.println(tk.delDouble(tk.arr));
        tk.findSymbol(tk.arr, 4);
        System.out.println(tk.findBigger(tk.arr));
        System.out.println(tk.connect2ArrWithoutDouble(tk.arr, tk.generateArr(new ArrayList<>(), 20)));
    }
}