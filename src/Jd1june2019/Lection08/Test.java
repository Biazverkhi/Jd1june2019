package Jd1june2019.Lection08;

import Jd1june2019.Lection08.Shape.Point.*;
import Jd1june2019.Lection08.Shape.Point;


public class Test {
    public static void main(String[] args) {

        Line lin2 = new Line(new Point(2, 4), new Point(4, 6));
        Reactangle rec = new Reactangle(new Point(2, 4), new Point(4, 6));
        System.out.println(rec.getArea());
        System.out.println(rec.toString());
    }
}

