package hw.hw14.hw14_1.Shapes;

import hw.hw14.hw14_1.Interface.IShape;

public class Circle implements IShape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }
    @Override
    public void square() {
        System.out.println("Площа круга з радіусом "+ r + " = "+ Math.PI*Math.pow(r, 2));
    }
}
