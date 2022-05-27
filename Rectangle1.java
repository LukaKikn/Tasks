package com.company;

public class Rectangle1 {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);
        r1.setWidth(5);
        System.out.println("Length is " + r1.getLength());
        System.out.println("Width is " + r1.getWidth());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("Area is " +r1.getArea());
    }

}
class Rectangle {

    private double width;
    private double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length){
        this.length=length;
    }

    public double getLength() {
        return length;
    }

    public double getPerimeter(){
        return (length + width)*2;
    }

    public double getArea(){
        return length * width;
    }

}
