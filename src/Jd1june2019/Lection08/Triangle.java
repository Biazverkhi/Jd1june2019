package Jd1june2019.Lection08;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.pow;

@Getter
@Setter
public class Triangle extends Shape implements Trianglable {
    private Point point1;
    private Point point2;
    private Point point3;
    private final String name = "Треугольник";
    private double a, b, c;
    private double height;

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {

        this.point1 = new Point(x1, y1);
        this.point2 = new Point(x2, y2);
        this.point3 = new Point(x3, y3);
        area();
        perimetr();
        // System.out.println(toString());
        toString();
    }

    @Override
    public void area() {
        double area;
        double a = new Point.Line(getPoint1(), getPoint2()).dinstanceLine();
        double b = new Point.Line(getPoint2(), getPoint3()).dinstanceLine();
        double c = new Point.Line(getPoint3(), getPoint1()).dinstanceLine();
        double p = (a + b + c) * 0.5;
        setA(a);
        setB(b);
        setC(c);
        area = pow((p * (p - a) * (p - b) * (p - c)), 2);
        setArea(area);

    }

    @Override
    public void perimetr() {
        double perimetr = getA() + getB() + getC();
        setPerimetr(perimetr);
    }

    @Override
    public void hight() {
        height = 2 * getArea() / getC();
        setHeight(height);
    }

    @Override
    public String toString() {
        System.out.println(name);
        return getClass().getName();
    }

}
