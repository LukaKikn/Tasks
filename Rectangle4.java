package Task4;

public class Rectangle4 {

    public static void main(String[] args) {
        Rectangle4 r1 = new Rectangle4();
        Rectangle4 r2 = new Rectangle4();
        r1.setLength(8);
        r1.setWidth(4);
        r2.setLength(6);
        r2.setWidth(4);

        System.out.println(Compare(r1,r2));
    }

    // compares areas of r1 and r2. if r1 > r2 returns 1. if r2 > r1 returns -1. if r1 = r2 returns 0

    private static int Compare(Rectangle4 x, Rectangle4 z) {
        return Double.compare(x.getArea(), z.getArea());
    }


    double width;
    double length;

    public double getArea() {
        return width * length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

}
