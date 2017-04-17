import java.util.ArrayList;

public class Birdwatcher {

    private ArrayList<Bird> database;

    public Birdwatcher() {
        this.database = new ArrayList<Bird>();
    }

    public void add(Bird bird) {
        database.add(bird);
    }

    public Bird getBird(String name) {
        for (Bird b : database) {
            if(b.getName().equals(name)) {
                return b;
            }
        }
        return null;
    }

    public void show(String name) {
        for (Bird b : database) {
            if (b.getName().equals(name)) {
                System.out.println(b);
            }
        }
    }

    public void statistics() {
        for (Bird b : database) {
            System.out.println(b);
        }
    }

    public boolean isInDatabase(String name) {
        for (Bird b : database) {
           if(b.getName().equals(name)) {
               return true;
           }
        }
        return false;
    }
}