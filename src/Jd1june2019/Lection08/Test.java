package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point;
import Jd1june2019.Lection08.Shape.Point.Line;


public class Test {
    public static void main(String[] args) {

        Line lin2 = new Line(new Point(2, 4), new Point(4, 6));
        Reactangle rec = new Reactangle(new Point(1, 1), new Point(4, 6));
        Square sc = new Square(1,1,5);
        Shape cr=new Circle(new Point(1,1), 23);
        Shape tr = new Triangle(1, 1, 4, 5, 10, 1);
        Shape sh=new Square(2,2,5);
        System.out.println(sc.areaCompare(sh));
        System.out.println(ShapeUtils.isRectangle(rec));
        System.out.println(ShapeUtils.isRectangle(cr));

    }
}

