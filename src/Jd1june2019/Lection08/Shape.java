package Jd1june2019.Lection08;

import lombok.Getter;
import lombok.Setter;

import static java.lang.Math.*;
@Getter
@Setter

public abstract class Shape {

    private double area;
    private double perimetr;

    @Getter
    @Setter
    public static class Point {//вложенный класс
        private int x;
        private int y;


        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static class Line {//вложенный класс

            private Point point1;
            private Point point2;
            private double distanceLine;

            public Line(Point point1, Point point2) {
                this.point1 = point1;
                this.point2 = point2;
                this.distanceLine=dinstanceLine();
            }

            public double dinstanceLine() {
                int x1 = this.point1.getX();
                int x2 = this.point2.getX();
                int y1 = this.point1.getY();
                int y2 = this.point2.getY();
                int deltaX = abs(x1 - x2);
                int deltaY = abs(y1 - y2);
                distanceLine = sqrt(pow(deltaX, 2) + pow(deltaY, 2));
                return distanceLine;
            }

        }


    }


}