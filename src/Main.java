package src;

public class Main
{
    public static void main(String[] args)
    {
        boolean play = true;
        int earthAngle = 0;
        int moonAngle = 90;
        SolarSystem mySystem = new SolarSystem(800, 800);
        Planet sun = new Planet(0, 0, 150, "YELLOW");
        Planet theEarth = new Planet(300, earthAngle, 35, "BLUE");
        Moon theMoon = new Moon(30, moonAngle, 15, "GRAY", theEarth.getDistance(), earthAngle);

        while(play) {
            theEarth.setAngle(earthAngle);
            theMoon.setAngle(moonAngle);
            theMoon.setRotationAngle(earthAngle);
            mySystem.drawSolarObject((double) sun.getDistance(), (double) sun.getAngle(), (double) sun.getDiameter(), sun.getColor());
            mySystem.drawSolarObject((double) theEarth.getDistance(), (double) theEarth.getAngle(), (double) theEarth.getDiameter(), theEarth.getColor());
            mySystem.drawSolarObjectAbout(theMoon.getDistance(), theMoon.getAngle(), theMoon.getDiameter(), theMoon.getColor(), theEarth.getDistance(),theMoon.getRotationAngle());
            mySystem.finishedDrawing();
            earthAngle = (earthAngle + 1) % 360;
            moonAngle = (moonAngle + 5) % 360;
        }
    }
}
