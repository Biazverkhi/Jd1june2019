package Jd1june2019.Lection08;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

@Getter
@Setter
public class Circle extends Shape implements Solverable {
    private int radius;
    private Point point;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
        area();
        perimetr();
    }


    @Override
    public void area() {
        double area = PI * pow(radius, 2);
        setArea(area);
    }

    @Override
    public void perimetr() {
        double perimetr = 2 * PI * radius;
        setPerimetr(perimetr);
    }
    @Override
    public String toString() {
        System.out.println("окружность");
        return getClass().getName();
    }

}
