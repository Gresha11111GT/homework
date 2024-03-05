package hw.hw14.hw14_2;

import hw.hw14.hw14_2.Animals.Bird;
import hw.hw14.hw14_2.Animals.Cat;
import hw.hw14.hw14_2.Animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("lora");
        cat.eat();
        cat.makeSound();
        Dog dog = new Dog("ball");
        dog.eat();
        dog.makeSound();
        Bird bird = new Bird("kesha", "bird food");
        bird.eat();
        bird.makeSound();
    }
}
