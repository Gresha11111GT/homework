package ls;

public class ls10 {
    public static void main(String[] args) {



        setName("Hello the world one strongest in ");





//        System.out.println(setName("Dart"));
    }
    public static void setName(String name){
        String[] ar = name.split(" ");
        String biggest_word = "";
//        ar[0].length()
        for (int i = 0; i < ar.length-1; i++) {
            if (ar[i].length() < ar[i+1].length()) {
                biggest_word = ar[i+1];
            }
        }
        System.out.println("Word '"+biggest_word+"' is the biggest word in a row");
    }
}
