package be.intecbrussel.graphics;

public class EqualsDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 15, 1, 1);
        Rectangle r2 = new Rectangle(10, 15, 1, 1);

        System.out.println(r1 == r2);
        System.out.println(r1.equals(r2));
    }
}
