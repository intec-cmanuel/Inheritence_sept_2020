package be.intecbrussel.demo;

public class Human extends Mammal {
    private String spine = "Human Spine";

    public Human(String name) {
        super(name);
    }

    public Human() {
        this("Potatosaladjellybeanadvocadotriangularsquare");
    }

    @Override
    public String getSpine() {
        return this.spine;
    }

    @Override
    public void setSpine(String spine) {
        this.spine = spine;
    }

    public String getDefaultSpine(){
        return super.getSpine();
    }

    public void eat() {
        System.out.println("eating anthony");
    }

    @Override
    public void attack() {
        System.out.println("Anthony massacres all dogs and cats");
    }
}
