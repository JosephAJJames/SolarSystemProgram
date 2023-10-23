package src;

public class Moon extends CelestialBody {
    private int rotationDistance;
    private int rotationAngle;

    public Moon(int distance, int angle, int diameter, String color, int rotationDistance, int rotationAngle) {
        super(distance, angle, diameter, color);
        this.rotationDistance = rotationDistance;
        this.rotationAngle = rotationAngle;
    }

    public int getRotationDistance() {
        return this.rotationDistance;
    }

    public int getRotationAngle() {
        return this.rotationAngle;
    }

    public void setRotationDistance(int rotationDistance) {
        this.rotationDistance = rotationDistance;
    }

    public void setRotationAngle(int rotationAngle) {
        this.rotationAngle = rotationAngle;
    }
}
