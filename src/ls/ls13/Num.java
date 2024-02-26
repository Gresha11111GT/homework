package ls.ls13;

import java.util.HashMap;

public class Num {
    HashMap<String, Integer> contact = new HashMap<>();
    public void add(String name, int number){
        contact.put(name, number);
    }
    public void remove(String name){
        contact.remove(name);
    }
    public void read(String name){
        System.out.println(contact.get(name));
    }
}
