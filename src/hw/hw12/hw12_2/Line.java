package hw.hw12.hw12_2;

public class Line extends Shape{
    private int a;
    public Line(String circle) {
        super(circle);
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public void s() {
        System.out.println(a);
    }
}
