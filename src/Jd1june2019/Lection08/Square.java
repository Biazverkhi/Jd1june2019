package Jd1june2019.Lection08;

public class Square extends Reactangle {


    public Square(Point point1, int distance)//квадрат, задаем по точке и длине стороны
    {

        super(point1, new Point(point1.getX()+distance,point1.getY()+distance));//почему ему надо вызывать некий дефолтовый конструктор родительского класса?

    }

    @Override
    public void area() {
        double area;
        int a = (int) new Point.Line(getPoint1(), getPoint2()).dinstanceLine();//просто поигрался с приведением
        area = a * a;
        setArea(area);

    }

    @Override
    public void perimetr() {
        int perimetr;
        int a = (int) new Point.Line(getPoint1(), getPoint2()).dinstanceLine();
        perimetr = 4 * a;
        setPerimetr(perimetr);

    }
    @Override
    public String toString() {
        System.out.println("квадрат");
        return getClass().getName();
    }
}
