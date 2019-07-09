package Jd1june2019.Lection08;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Task3_Point {
    private int x;
    private int y;

    public Task3_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        double distance;
        distance = sqrt(pow(x, 2) + pow(y, 2));

        return distance;
    }
}
