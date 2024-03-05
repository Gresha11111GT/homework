package hw.hw14.hw14_1;

import hw.hw14.hw14_1.Shapes.Circle;
import hw.hw14.hw14_1.Shapes.Rect;
import hw.hw14.hw14_1.Shapes.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(30);
        Rect rect = new Rect(10, 15);
        Triangle triangle1 =  new Triangle(10, 5, 6);
        Triangle triangle2 =  new Triangle(10, 5, 3);
        circle.square();
        rect.square();
        triangle1.square();
        triangle2.square();
    }
}
