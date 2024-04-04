package hw;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class hw19 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        listAdd(list);
        AllT(list);
        listAdd(list);
        AllT(list);
    }
    public static void listAdd(List<Integer> list){
        Scanner console = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int a = console.nextInt();
            list.addLast(a);
        }
    }
    public static void AllT(List<Integer> list){
        System.out.println(list);
        System.out.println(t1(list));
        t2(list);
        System.out.println(t3(list));
        t4(list);
        t5(list);
    }
    public static int t1(List<Integer> list){
        return list.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
    }
    public static void t2(List<Integer> list){
        list = list.stream().map(x -> x*2).collect(Collectors.toList());
        System.out.println("Результат помноження кожного числа у списку на 2:");
        System.out.println(list);
    }
    public static int t3(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).max().orElseThrow();
    }
    public static void t4(List<Integer> list){
        System.out.println(list.stream().filter(x -> x % 2 != 0).map(Object::toString).collect(Collectors.joining(", ")));
    }
    public static double t5(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

}
