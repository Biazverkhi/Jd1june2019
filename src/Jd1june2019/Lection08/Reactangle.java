package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.Line;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reactangle extends Quadangle implements Diagonable {//класс описывает прямоугольник.
    private final String name = "Прямоугольник";
    private double diagonale;


    public Reactangle(Point point1, Point point3) {
        super(point1, new Point(point1.getX(), point3.getY()), point3, new Point(point3.getX(), point1.getY()));
        diagonal();
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
        System.out.println(name);
        return getClass().getName();
    }

    @Override
    public void diagonal() {
      double diagonal;
        diagonal= new Line(getPoint1(), getPoint3()).dinstanceLine();
        setDiagonale(diagonal);
    }
}
