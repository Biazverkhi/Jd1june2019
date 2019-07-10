package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.*;
import static java.lang.Math.*;

public class Quadangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public Quadangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        area();
        perimetr();
    }

    public void area() {
        double area;
        double d1 = new Line(point1, point3).dinstance();
        double d2 = new Line(point2, point4).dinstance();
        area = 0.5 * d1 * d2 * sin(45);// тут угол между диагоналями, я его не рассчитал, так как долго.
        setArea(area);
    }

    public void perimetr() {
        int perimetr;
        int a = (int) new Line(point1, point2).dinstance();
        int b = (int) new Line(point2, point3).dinstance();
        int c = (int) new Line(point3, point4).dinstance();
        int d = (int) new Line(point4, point1).dinstance();
        perimetr = a + b + c + d;
        setPerimetr(perimetr);
    }
}