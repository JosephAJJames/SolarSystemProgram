package src;

public class Moon extends CelestialBody {
    /**
     * Sub-class of the CelestialBody Class
     * @author Joseph James
     */
    private int rotationDistance;
    private int rotationAngle;

    /**
     *
     * @param distance distance from moon to point around which it orbits
     * @param angle angle of the moon around the point around which it orbits
     * @param diameter diameter of the moon
     * @param color colour of the moon
     * @param rotationDistance distance between the sun and the point about which the moon orbits
     * @param rotationAngle angle around the sun about which the moon is orbiting
     */
    public Moon(int distance, int angle, int diameter, String color, int rotationDistance, int rotationAngle) {
        super(distance, angle, diameter, color);
        this.rotationDistance = rotationDistance;
        this.rotationAngle = rotationAngle;
    }

    /**
     * @return returns the distance between the sun and the point about which it's orbiting
     */
    public int getRotationDistance() {
        return this.rotationDistance;
    }

    /**
     * @return returns the angle around the sun about which the moon is orbiting
     */
    public int getRotationAngle() {
        return this.rotationAngle;
    }

    /**
     * @param rotationDistance sets the distance between the sun and the point about which the moon orbits
     */
    public void setRotationDistance(int rotationDistance) {
        this.rotationDistance = rotationDistance;
    }

    /**
     * @param rotationAngle sets the angle around the sun about which the moon is orbiting
     */
    public void setRotationAngle(int rotationAngle) {
        this.rotationAngle = rotationAngle;
    }
}
