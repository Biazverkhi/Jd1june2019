package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.*;


public class Reactangle extends Quadangle implements Diagonable {//класс описывает прямоугольник.
    private double distance;

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

//    public Reactangle(Point point1, Point point2, Point point3, Point point4) {
//        super(point1, point2, point3, point4);
//    }

    public Reactangle(Point point1, Point point3) {
        super(point1, new Point(point1.getX(), point3.getY()), point3, new Point(point3.getX(), point1.getY()));
        distance=diagonal();

    }

    @Override
    public void area() {
        double area;
        int a = (int) new Line(getPoint1(), getPoint2()).dinstanceLine();
        int b = (int) new Line(getPoint2(), getPoint3()).dinstanceLine();
        area = a * b;
        setArea(area);

    }

    @Override
    public void perimetr() {//сознательно int расширяю до double.
        int perimetr;
        int a = (int) new Line(getPoint1(), getPoint2()).dinstanceLine();//я знаю что можно создать переменную экземпляра и не дублировать расчет. Продемонстрирую это в другом классе Triangle..
        int b = (int) new Line(getPoint2(), getPoint3()).dinstanceLine();
        perimetr = 2 * (a + b);
        setPerimetr(perimetr);

    }
    @Override
    public String toString() {
        System.out.println("прямоугольник");
        return getClass().getName();
    }

    @Override
    public double diagonal() {
      double diagonal;
        diagonal= new Line(getPoint1(), getPoint3()).dinstanceLine();
setDistance(diagonal);
        return diagonal;
    }
}
