import models.Point;
import models.Shape;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class MyApplication {
    public static void main(String[] args){
        try{
            File file = new File("C:\\Users\\Asus\\IdeaProjects\\assignment 1 Rauan\\source.txt");
            Scanner sc = new Scanner(file);
            Shape shape = new Shape();
            while (sc.hasNext()) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                Point point = new Point(x, y);
                shape.addPoint(point);
            }
            System.out.println(shape.calculatePerimeter());
            System.out.println(shape.getAverageSide());
            System.out.println(shape.getLongestSide());
        } catch (FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}