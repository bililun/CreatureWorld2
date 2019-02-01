import java.util.ArrayList;

public abstract class CreatureWorldThing {
    private int id;
    private int x;
    private int y;
    protected final CreatureWorldMain app = CreatureWorldMain.getApp();

    public CreatureWorldThing(int _id, int _x, int _y){
        id = _id;
        x = _x;
        y = _y;
    }

    public int getID(){
        return id;
    }

    public int getX(){
        return x;
    }

    public void setX(int _x){
        x = _x;
    }

    public int getY(){
        return y;
    }

    public void setY(int _y){
        y = _y;
    }

    public abstract void update(ArrayList<CreatureWorldThing> things);

    protected abstract void display();
}