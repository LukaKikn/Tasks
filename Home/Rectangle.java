package ge.ufc.homework5;

public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(String asd) {
        super(asd);
    }
    public Rectangle() {
        this(3, 4);
    }


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    protected double getPerimeter(){
        return  (this.length + this.width) * 2;
    }
    protected double getArea(){
        return  this.length * this.width;
    }

    protected double getPerimeter(double length, double width){
        return (length + width) * 2;
    }

    protected double getArea(double length, double width) {
        return length * width;
    }

}
