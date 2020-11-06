package be.intecbrussel.graphics;

public class SquareApp {
    public static void main(String[] args) {
        Square triangle = new Square();
        Square fourangle = new Square(30);
        Square fivangle = new Square(30,52,66);
        Square sixangle = new Square(fourangle);

        triangle.setPosition(30, 50);
        triangle.setSide(-20);
        triangle.setHeight(77);
        triangle.setWidth(88);

        printSquare(triangle);
        printSquare(fourangle);
        printSquare(fivangle);
        printSquare(sixangle);
    }

    public static void printSquare(Square triangle) {
        System.out.println("Side: " + triangle.getSide());
        System.out.println("X: " + triangle.getX());
        System.out.println("Y: " + triangle.getY());
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println();
    }
}
