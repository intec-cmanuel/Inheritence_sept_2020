package be.intecbrussel.graphics;

public class Circle extends Shape{
    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    public void grow(int d) {
        this.radius *= Math.abs(d);
    }
}
