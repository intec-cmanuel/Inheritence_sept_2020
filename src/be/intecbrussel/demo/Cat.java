package be.intecbrussel.demo;

public class Cat extends Mammal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Cat scratches you know who.");
    }
}
