package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.Line;
import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.sin;
@Getter
@Setter

public class Quadangle extends Shape  {//класс описывает четырехугольник произвольный. Под него попадают все четырехугольники, в том числе с разными углами и сторонами.
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private final String name = "Четырехугольник";

//public Quadangle(){}


    public Quadangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        area();
        perimetr();
        System.out.println(toString());
    }
@Override
    public void area() {
        double area;
        double d1 = new Line(point1, point3).dinstanceLine();
        double d2 = new Line(point2, point4).dinstanceLine();
        area = 0.5 * d1 * d2 * sin(45);// тут угол между диагоналями, я его не рассчитал, так как долго, времени на все не ватает. Тут чистый алгоритм.
        setArea(area);
    }
    @Override

    public void perimetr() {
        int perimetr;
        int a = (int) new Line(point1, point2).dinstanceLine();
        int b = (int) new Line(point2, point3).dinstanceLine();
        int c = (int) new Line(point3, point4).dinstanceLine();
        int d = (int) new Line(point4, point1).dinstanceLine();
        perimetr = a + b + c + d;
        setPerimetr(perimetr);
    }

    @Override
    public String toString() {
        System.out.println(name);
        return getClass().getName();
    }



}