package Jd1june2019.Lection08;
import static java.lang.Math.pow;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Triangle extends Shape implements Trianglable, Solverable{
    private Point point1;
    private Point point2;
    private Point point3;
    private double a,b,c;
private double height;

    @Override
    public void area() {
        double area;
        double a = new Point.Line(getPoint1(), getPoint2()).dinstanceLine();
        double b = new Point.Line(getPoint2(), getPoint3()).dinstanceLine();
        double c = new Point.Line(getPoint3(), getPoint1()).dinstanceLine();
       double p=(a+b+c)*0.5;
       setA(a); setB(b);setC(c);
       area = pow((p*(p-a)*(p-b)*(p-c)),2);
        setArea(area);

    }

    @Override
    public void perimetr() {
double perimetr=getA()+getB()+getC();
setPerimetr(perimetr);
    }

    @Override
    public void hight() {
height=2*getArea()/getC();
setHeight(height);
    }
    @Override
    public String toString() {
        System.out.println("треугольник");
        return getClass().getName();
    }

}
