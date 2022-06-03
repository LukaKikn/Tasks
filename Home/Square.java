package ge.ufc.square;

import ge.ufc.homework5.Rectangle;

public final class Square extends Rectangle {

    private double side;
    public void setSide(double side) {
        this.side = side;
    }

    protected double getPerimeter(){
        return getPerimeter(side,side);
    }
    protected double getArea(){
        return getArea(side,side);
    }
}
