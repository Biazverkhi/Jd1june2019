package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.*;
import Jd1june2019.Lection08.Shape.*;


public class Reactangle extends Quadangle {
    public Reactangle(Point point1, Point point2, Point point3, Point point4) {
        super(point1, point2, point3, point4);
    }

    public Reactangle(Point point1, Point point3) {
        super(point1, new Point(point1.getX(), point3.getY()), point3, new Point(point3.getX(), point1.getY()));

    }

    @Override
    public void area() {
        double area;
        int a = (int) new Line(getPoint1(), getPoint2()).dinstance();
        int b = (int) new Line(getPoint2(), getPoint3()).dinstance();
        area = a * b;
        setArea(area);

    }

    @Override
    public void perimetr() {
        int perimetr;
        int a = (int) new Line(getPoint1(), getPoint2()).dinstance();
        int b = (int) new Line(getPoint2(), getPoint3()).dinstance();
        perimetr = 2 * (a + b);
        setPerimetr(perimetr);

    }

    public String toString() {
        System.out.println("прямоугольник");
        return getClass().getName();
    }
}
