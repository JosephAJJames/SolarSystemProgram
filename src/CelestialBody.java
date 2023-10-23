package src;

public class CelestialBody {
    private int distance;
    private int angle;
    private int diameter;
    private String color;

    public CelestialBody(int distance, int angle, int diameter, String color) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
    }

    public int getDistance() {
        return this.distance;
    }

    public int getAngle() {
        return this.angle;
    }

    public int getDiameter() {
        return this.diameter;
    }

    public String getColor() {
        return this.color;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
