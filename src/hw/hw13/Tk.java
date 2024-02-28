package hw.hw13;

import java.util.ArrayList;

public class Tk {
    ArrayList<Integer> arr = new ArrayList<>();
    public ArrayList<Integer> generateArr(ArrayList<Integer> arr, int countOfNumb){
        for (int i = 0; i < countOfNumb; i++) {
            int numb = (int) (Math.random()*countOfNumb);
            arr.add(numb);
        }
        return arr;
    }
    public ArrayList<Integer> sortInc(ArrayList<Integer> arr){
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j >= 1; j--) {
                if (arr.get(j) < arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
                else
                    break;
            }
        }
        return arr;
    }
    public ArrayList<Integer> sortDec(ArrayList<Integer> arr){
        for (int i = 1; i < arr.size(); i++) {
            for (int j = i; j >= 1; j--) {
                if (arr.get(j) > arr.get(j - 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j - 1));
                    arr.set(j - 1, temp);
                }
                else
                    break;
            }
        }
        return arr;
    }
    public ArrayList<Integer> delDouble(ArrayList<Integer> arr){
        for (int i = 0; i < arr.size()-1; i++) {
            int num = arr.get(i);
            for (int j = i+1; j < arr.size(); j++) {
                if (num == arr.get(j)){
                    arr.remove(j);
                    j-=1;
                }
            }
        }
        return arr;
    }
    public int findBigger(ArrayList<Integer> arr){
        int bigger = arr.getFirst();
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (bigger < arr.get(j))
                    bigger = arr.get(j);
            }
        }
            return bigger;
    }
    public ArrayList<Integer> connect2ArrWithoutDouble(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        arr1.addAll(arr2);
        delDouble(arr1);
        return arr1;
    }
    public void findSymbol(ArrayList<Integer> arr, int symbol){
        if(!arr.contains(symbol))
            System.out.println("Так");
        else System.out.println("Ні");
    }
}
