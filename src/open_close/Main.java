package open_close;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        ShapesPrinter printer = new ShapesPrinter();

        Circle circle = new Circle(5);
        Square square = new Square(10);
        Triangle triangle = new Triangle(10, 5);
        Cube cube = new Cube(5);

        List<Shape> shapes = List.of(circle, square, triangle, cube);

        double sum = areaCalculator.sum(shapes);
        System.out.println(printer.json(sum));;
    }
}