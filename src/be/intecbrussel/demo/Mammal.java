package be.intecbrussel.demo;

public abstract class Mammal {
    private String spine = "Default Spine";
    private String name;

    public Mammal(String name) {
        this.name = name;
    }

    public String getSpine(){
        return this.spine;
    }

    public abstract void attack();

    public void setSpine(String spine){
        this.spine = spine;
    }
}
