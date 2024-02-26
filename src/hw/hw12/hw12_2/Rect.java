package hw.hw12.hw12_2;

public class Rect extends Shape{
    int a;
    int b;
    public Rect(String circle) {
        super(circle);
    }
    public void setRect(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public void s() {
        System.out.println(a*b);
    }
}
