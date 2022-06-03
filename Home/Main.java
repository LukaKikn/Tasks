package ge.ufc.homework5;

import ge.ufc.square.Square;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Figure f1 = new Figure("Luka");
        Square s1 = new Square();


        System.out.println(r1 instanceof Figure);
        System.out.println(f1 instanceof Rectangle);
        System.out.println(r1 instanceof Rectangle);
        System.out.println(f1 instanceof Figure);
        System.out.println(s1 instanceof Figure);
        System.out.println(s1 instanceof Rectangle);


        System.out.println(r1.getPerimeter());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter(12.5,2.5));
        System.out.println(r1.getArea(12.5,2.5));
        System.out.println(s1.getPerimeter(6,4));
        System.out.println(s1.getArea(6,4));
        Figure.sayHello();


    }
}
