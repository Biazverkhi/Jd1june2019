package Jd1june2019.Lection08;

import static java.lang.Math.*;

public abstract class Shape {

    private double area;
    private int perimetr;

    public double getArea() {
        return area;
    }

    public int getPerimetr() {
        return perimetr;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetr(int perimetr) {
        this.perimetr = perimetr;
    }


    public static class Point {
        private int x;
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public static class Line {

            private Point point1;
            private Point point2;

            public Line(Point point1, Point point2) {
                this.point1 = point1;
                this.point2 = point2;
            }

//            public Point getPoint1() {
//                return point1;
//            }
//
//            public Point getPoint2() {
//                return point2;
//            }

            public double dinstance() {
                double distance;
                int x1 = this.point1.getX();
                int x2 = this.point2.getX();
                int y1 = this.point1.getY();
                int y2 = this.point2.getY();
                int deltaX = abs(x1 - x2);
                int deltaY = abs(y1 - y2);
                distance = sqrt(pow(deltaX, 2) + pow(deltaY, 2));
                return distance;
            }

        }


    }


}