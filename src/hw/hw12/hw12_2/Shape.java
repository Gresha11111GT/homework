package hw.hw12.hw12_2;

public class Shape {
    private int x;
    private int y;
    public Shape(String circle) {

    }

    public void move(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void print(){
        System.out.println("x ="+x+" y="+y);
    }

    public void s() {
        System.out.println("shape s");
    }
}
