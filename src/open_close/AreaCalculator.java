package open_close;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Object> shapes) {
        int sum = 0;
        for (Object shape : shapes) {
            if (shape instanceof Square) {
                sum += (int) Math.pow(((Square) shape).getLength(), 2);
            }
            if (shape instanceof Circle) {
                sum += (int) (Math.PI * Math.pow(((Circle) shape).getRadius(), 2));
            }
        }
        return sum;
    }
}
