
public class Plane {

    private String planeId;
    private int planeCapacity;

    public Plane(String planeId, int planeCapacity) {
        this.planeId = planeId;
        this.planeCapacity = planeCapacity;
    }

    public String getPlaneId() {
        return this.planeId;
    }

    public String toString() {
        return this.planeId + " (" + this.planeCapacity + " ppl)";
    }
}
