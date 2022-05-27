package Task3;


public class Task3 {

    public static void main(String[] args) {
//        Rectangle r;
//        System.out.println(r.getLength());
//        variable r might not have been initialized

//        r = null;
//        System.out.println(r.getLength());
//        NullPointerException

//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle();
//        System.out.println(r1 == r2);
//        აბრუნებს false-ს.

//        Rectangle r1 = new Rectangle();
//        Rectangle r2 = new Rectangle();
//        r2 = r1;
//        System.out.println(r1==r2);
//        აბრუნებს true-ს.
    }
}

class Rectangle{

    double width;
    double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
