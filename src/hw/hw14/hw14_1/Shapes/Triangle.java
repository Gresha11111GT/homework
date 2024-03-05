package hw.hw14.hw14_1.Shapes;
import hw.hw14.hw14_1.Interface.IShape;

public class Triangle implements IShape {
    private int a;
    private int b;

    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public void square() {
        double p = (a + b + c) /2.0;
        p = (p*(p - a)*(p - b)*(p - c));
        if(p>0)
            System.out.println("Площа трикутника зі сторонами " + a + ", "+ b + ", "+ c + " = " + Math.sqrt(p));
        else
            System.out.println("Такого трикутника не існуе");
    }
}
