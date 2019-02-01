public abstract class CreatureWorldThing {
    private int id;
    private int x;
    private int y;
    protected final CreatureWorldApp app = CreatureWorldApp.getApp();

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

    public abstract void update(CreatureWorldThing[] things);

    protected abstract void display();
}