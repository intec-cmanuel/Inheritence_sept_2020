package be.intecbrussel.demo;

public class Dog extends Mammal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Dog bites anthony.");
    }
}
