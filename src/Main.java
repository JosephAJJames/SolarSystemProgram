package src;

public class Main
{
    public static void main(String[] args)
    {
        boolean play = true;
        int earthAngle = 0;
        int moonAngle = 90;
        int marsAngle = 75;
        int jupiterAngle = 180;
        int saturnAngle = 270;
        int anusAngle = 300;
        int nepAngle = 350;

        SolarSystem mySystem = new SolarSystem(1000, 1000);
        Planet sun = new Planet(0, 0, 150, "YELLOW");
        Planet theEarth = new Planet(300, earthAngle, 25, "BLUE");
        Moon theMoon = new Moon(30, moonAngle, 15, "GRAY", theEarth.getDistance(), earthAngle);
        Planet theMars = new Planet(350, marsAngle, 30, "RED");
        Planet theJupiter = new Planet(400, jupiterAngle, 40, "MAGENTA");
        Planet theSaturn = new Planet(450, saturnAngle, 35, "MAGENTA");
        Planet theUranus = new Planet(500, anusAngle, 27, "CYAN");
        Planet theNeptune = new Planet(550, nepAngle, 20, "BLUE");
        CelestialBody[] SolarObjects = {sun, theEarth, theMars, theJupiter, theSaturn, theUranus, theNeptune, theMoon};

        while(play) {
            /*
            theEarth.setAngle(earthAngle);
            theMoon.setAngle(moonAngle);
            theMoon.setRotationAngle(earthAngle);
            theMars.setAngle(marsAngle);
            theJupiter.setAngle(jupiterAngle);
            theSaturn.setAngle(saturnAngle);
            theUranus.setAngle(anusAngle);
            theNeptune.setAngle(nepAngle);
            */


            for (int x = 0; x < 8; x++) {
                if (SolarObjects[x] instanceof Planet) {
                    mySystem.drawSolarObject(SolarObjects[x].getDistance(), SolarObjects[x].getAngle(), SolarObjects[x].getDiameter(), SolarObjects[x].getColor());
                    int angle = SolarObjects[x].getAngle();
                    SolarObjects[x].setAngle((angle + 1) % 360);
                } else {
                    Moon moon = (Moon) SolarObjects[x];
                    mySystem.drawSolarObjectAbout(moon.getDistance(), moon.getAngle(), moon.getDiameter(), moon.getColor(), theEarth.getDistance(), moon.getRotationAngle());
                    int angle = moon.getAngle();
                    moon.setRotationAngle(theEarth.getAngle());
                    moon.setAngle((angle + 2) % 360);
                }
            }

            mySystem.finishedDrawing();

            /*
            mySystem.drawSolarObject((double) sun.getDistance(), (double) sun.getAngle(), (double) sun.getDiameter(), sun.getColor());
            mySystem.drawSolarObject((double) theEarth.getDistance(), (double) theEarth.getAngle(), (double) theEarth.getDiameter(), theEarth.getColor());
            mySystem.drawSolarObjectAbout(theMoon.getDistance(), theMoon.getAngle(), theMoon.getDiameter(), theMoon.getColor(), theEarth.getDistance(),theMoon.getRotationAngle());
            mySystem.drawSolarObject(theMars.getDistance(), theMars.getAngle(), theMars.getDiameter(), theMars.getColor());
            mySystem.drawSolarObject(theJupiter.getDistance(), theJupiter.getAngle(), theJupiter.getDiameter(), theJupiter.getColor());
            mySystem.drawSolarObject(theSaturn.getDistance(), theSaturn.getAngle(), theSaturn.getDiameter(), theSaturn.getColor());
            mySystem.drawSolarObject(theUranus.getDistance(), theUranus.getAngle(), theUranus.getDiameter(), theUranus.getColor());
            mySystem.drawSolarObject(theNeptune.getDistance(), theNeptune.getAngle(), theUranus.getDiameter(), theUranus.getColor());
            mySystem.finishedDrawing();
            */

        }
    }
}
