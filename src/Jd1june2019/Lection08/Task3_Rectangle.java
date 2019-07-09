package Jd1june2019.Lection08;

import static java.lang.Math.*;

public class Task3_Rectangle {
    Task3_Point point1;
    Task3_Point point2;

    public Task3_Rectangle() {
        point1 = new Task3_Point(4, 5);
        point2 = new Task3_Point(1, 1);
    }

    public int area() {
        int area;
        int x1 = point1.getX();
        int x2 = point2.getX();
        int y1 = point1.getY();
        int y2 = point2.getY();
        int deltaX = abs(x1 - x2);
        int deltaY = abs(y1 - y2);
        area = deltaX * deltaY;

        return area;
    }

    public double distance() {
        double distance;
        int x1 = point1.getX();
        int x2 = point2.getX();
        int y1 = point1.getY();
        int y2 = point2.getY();
        int deltaX = abs(x1 - x2);
        int deltaY = abs(y1 - y2);
        distance = sqrt(pow(deltaX, 2) + pow(deltaY, 2));


        return distance;
    }
}