package Jd1june2019.Lection08;

public class Task3_Test {
    public static void main(String[] args) {

        Task3_Point point1 = new Task3_Point(3, 4);
        double o = point1.distance();
        System.out.printf("%.2f\n", o);
        Task3_Rectangle rectangle = new Task3_Rectangle();
        int area = rectangle.area();
        double distance = rectangle.distance();
        System.out.printf("Площадь: %d, диагональ: %.2f", area, distance);
    }
}
