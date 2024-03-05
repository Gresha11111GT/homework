package hw.hw14.hw14_1.Shapes;
import hw.hw14.hw14_1.Interface.IShape;

public class Rect implements IShape {
    private int a;
    private int b;

    public Rect(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void square() {
        System.out.println("Площа прямокутника зі сторонами "+a + ", "+b+" = "+a*b);
    }
}
