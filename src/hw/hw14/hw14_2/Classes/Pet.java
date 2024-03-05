package hw.hw14.hw14_2.Classes;

public abstract class Pet implements IAnnimal {
    String name;
    String foodType;
    String sound;
    public Pet(String name, String foodType, String sound) {
        this.name = name;
        this.foodType = foodType;
        this.sound = sound;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " makes a sound: "+sound);
    }
    @Override
    public void eat() {
        System.out.println(name + " eats " + foodType);
    }

}