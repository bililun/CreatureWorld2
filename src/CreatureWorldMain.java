import processing.core.PApplet;

// Starter project for practicing use of abstract classes and interfaces.

public class CreatureWorldMain extends PApplet {
    private static CreatureWorldMain app;
    private CreatureWorldThing[] things;

    public static void main(String[] args) {
        PApplet.main("CreatureWorldMain");
    }

    public CreatureWorldMain(){
        super();
        app = this;
    }
    public void settings(){
        size(500, 500);
    }

    public void setup(){
        things = new CreatureWorldThing[3];
        things[0] = new Thing1(0);
        things[1] = new Thing2(1);
        things[2] = new Thing3(2);
    }

    public void draw(){
        background(255);
        for (int i = 0; i < things.length; i++){
            things[i].update(things);
        }
    }

    public static CreatureWorldMain getApp(){
        return app;
    }
}