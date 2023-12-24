package models;
import java.util.ArrayList;
public class Shape {

    private ArrayList<Point> points;

    public Shape() {
        points = new ArrayList<>();
    }

    private double[] getSides() {
        int size = points.size();
        double[] sides = new double[size];
        for (int i = 0; i < size; i++){
            if (i == size - 1) {
                sides[i] = points.get(i).getDistance(points.getFirst());
                break;
            }
            sides[i] = points.get(i).getDistance(points.get(i + 1));
        }
        return sides;
    }

    public void addPoint(Point point) {
        points.add(point);
    }

    public double calculatePerimeter() {
        double perimeter = 0;
        int sides = getSides().length;
        for (int i = 0; i < sides; i++) {
            perimeter += getSides()[i];
        }
        return perimeter;
    }

    public double getLongestSide() {
        int sides = points.size();
        double longSide = Double.MIN_VALUE;
        for (int i = 0; i < sides; i++) {
            if (getSides()[i] > longSide) {
                longSide = getSides()[i];
            }
        }
        return longSide;
    }

    public double getAverageSide() {
        int sides = getSides().length;
        double averageSide = calculatePerimeter() / sides;
        return averageSide;
    }
}
