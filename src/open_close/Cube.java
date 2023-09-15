package open_close;

public class Cube implements Shape {

    private final int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int getEdgeLength() {
        return edgeLength;
    }

    @Override
    public double area() {
        return 6 * (Math.pow(getEdgeLength(), 2));
    }
}
