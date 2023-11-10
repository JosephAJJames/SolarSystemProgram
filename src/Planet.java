package src;

public class Planet extends CelestialBody {
    /**
     * subclass of CelestialBody
     * @author Joseph James
     */

    /**
     *
     * @param distance distance from the sun
     * @param angle angle around the sun
     * @param diameter diameter of the planet
     * @param color colour of the planet
     */
    public Planet(int distance, int angle, int diameter, String color)
    {
        super(distance, angle, diameter, color);
    }
}
