package src;

public class CelestialBody {
    /**
     * Superclass for Moon and Planet
     * @author Joseph James
     */
    private int distance;
    private int angle;
    private int diameter;
    private String color;

    /**
     * @param distance distance between the sun and itself
     * @param angle angle of itself around the sun
     * @param diameter diameter of itself
     * @param color colour of itself
     */

    public CelestialBody(int distance, int angle, int diameter, String color) {
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.color = color;
    }

    /**
     * @return returns the distance between the sun and itself
     */
    public int getDistance() {
        return this.distance;
    }

    /**
     * @return returns the angle of itself around the sun
     */
    public int getAngle() {
        return this.angle;
    }

    /**
     * @return returns the diameter of itself
     */
    public int getDiameter() {
        return this.diameter;
    }

    /**
     * @return returns the colour of itself
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @param distance sets the distance between the sun and itself
     */
    public void setDistance(int distance) {
        this.distance = distance;
    }

    /**
     * @param angle sets the angle of itself around the sun
     */
    public void setAngle(int angle) {
        this.angle = angle;
    }

    /**
     * @param diameter sets the diameter of itself
     */
    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    /**
     * @param color sets the colour of itself
     */
    public void setColor(String color) {
        this.color = color;
    }
}
