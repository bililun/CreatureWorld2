import processing.core.PApplet;

import java.util.ArrayList;

// Starter project for practicing use of abstract classes and interfaces.

public class CreatureWorldMain extends PApplet {
    private static CreatureWorldMain app;
    private ArrayList<CreatureWorldThing> things;

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
        things = new ArrayList<CreatureWorldThing>(3);
        things.add(new Thing1(0));
        things.add(new Thing2(1));
        things.add(new Thing3(2));
    }

    public void draw(){
        background(255);
        for (CreatureWorldThing t : things){
           t.update(things);
        }
    }

    public void mousePressed() {
        float r = random(1);
        if (r < 0.1) {
            things.add(new Thing1(things.size()));
        } else if (r < 0.75) {
            things.add(new Thing2(things.size()));
        } else {
            things.add(new Thing3(things.size()));
        }
    }

    public static CreatureWorldMain getApp(){
        return app;
    }
}