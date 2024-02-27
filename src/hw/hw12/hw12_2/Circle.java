package hw.hw12.hw12_2;

public class Circle extends Shape{
    private int r;

    public Circle(String circle) {
        super(circle);
    }
    public void setR(int r) {
        this.r = r;
    }
    @Override
    public void s() {
        System.out.println(Math.PI*r);
    }
}