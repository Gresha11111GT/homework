package hw.hw12.hw12_2;

public class Trapeze extends Shape{
    private int a;
    private int b;
    private int h;

    public Trapeze(String circle) {
        super(circle);
    }
    public void setTrapeze(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    @Override
    public void s() {
        System.out.println(((a+b)/2)*h);
    }
}
