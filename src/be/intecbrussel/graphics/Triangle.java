package be.intecbrussel.graphics;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle(){
        this(10, 10, 10,10,10);
    }

    public Triangle(int height, int width, int perpendicular){
        this(height, width, perpendicular, 10, 10);
    }

    public Triangle(int height, int width, int perpendicular, int x, int y) {
        super(x, y);
        setHeight(height);
        setWidth(width);
        setPerpendicular(perpendicular);
    }

    public Triangle(Triangle triangle) {
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return 0.5 * (this.width * this.height);
    }

    @Override
    public double getPerimeter() {
        double hypotenuse1 = Math.hypot(this.height, this.perpendicular);
        double hypotenuse2 = Math.hypot(this.height, (this.width - this.perpendicular));
        return this.width + hypotenuse1 + hypotenuse2;
    }

    public static int getCount() {
        return count;
    }
}
