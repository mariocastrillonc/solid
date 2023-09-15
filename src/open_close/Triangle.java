package open_close;

public class Triangle implements Shape {
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return (double) (base * height) / 2;
    }
}
