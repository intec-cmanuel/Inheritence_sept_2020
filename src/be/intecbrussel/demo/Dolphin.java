package be.intecbrussel.demo;

public class Dolphin extends Mammal{
    public Dolphin(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("Dolphin uses splash.");
    }
}
