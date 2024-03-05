package hw.hw14.hw14_2.Animals;

import hw.hw14.hw14_2.Classes.IAnnimal;

public class Bird implements IAnnimal {
    String name;
    String foodType;
    public Bird(String name, String foodType) {
        this.name = name;
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println(name+" makes a sound: cvirin");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats " + foodType + ".");
    }
}
