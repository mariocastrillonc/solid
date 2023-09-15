package open_close;

import java.util.List;

public class AreaCalculator {

    public double sum(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += (int) shape.area();
        }
        return sum;
    }
}
