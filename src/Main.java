package src;

public class Main
{
    public static void main(String[] args)
    {
        boolean play = true;
        int earthAngle = 0;
        SolarSystem mySystem = new SolarSystem(800, 800);
        Planet sun = new Planet(0, 0, 150, "YELLOW");
        Planet theEarth = new Planet(300, earthAngle, 35, "BLUE");
        Moon theMoon = new Moon(300, 0, 15, "GRAY", 100, 50);

        while(play) {
            theEarth.setAngle(earthAngle);
            mySystem.drawSolarObject((double) sun.getDistance(), (double) sun.getAngle(), (double) sun.getDiameter(), sun.getColor());
            mySystem.drawSolarObject((double) theEarth.getDistance(), (double) theEarth.getAngle(), (double) theEarth.getDiameter(), theEarth.getColor());
            mySystem.drawSolarObjectAbout((double) theMoon.getDistance(), (double) theMoon.getAngle(), (double) theMoon.getDiameter(), theMoon.getColor(), (double) theMoon.getRotationDistance(), (double) theMoon.getRotationAngle());
            mySystem.finishedDrawing();
            if (earthAngle > 360) {
                earthAngle = 0;
            } else {
                ++earthAngle;
            }
        }
    }
}
