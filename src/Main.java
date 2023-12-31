package src;

public class Main
        /**
         * Driver class
         * @author Joseph James
         */
{
    public static void main(String[] args)
    {
        /**
        * Initial angles for planets
         **/
        boolean play = true;
        int earthAngle = 0;
        int moonAngle = 90;
        int marsAngle = 75;
        int jupiterAngle = 180;
        int saturnAngle = 270;
        int anusAngle = 300;
        int nepAngle = 350;


        /**
        *Planets
         **/
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
        Planet[] asteroids = new Planet[300];
        Planet asteroid = new Planet(300, 0,5, "GRAY");

        /**
         *Drawing asteroid belt
         **/
        for (int x = 0; x < 300; x++) {
            asteroids[x] = asteroid;
        }

        /**
        * populating saturns rings array
         **/
        Moon saturnRing = new Moon(20, 0 ,5 , "GRAY", theSaturn.getDistance(), theSaturn.getAngle());
        Moon[] rings = new Moon[20];
        for (int x = 0; x < 20; x++) {
            rings[x] = saturnRing;
        }


        while(play) {

            /**
            * Drawing the planets
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

            /**
            * Drawing Astroid belt
             **/

            for (int x = 0; x < 300; x++) {
                mySystem.drawSolarObject(asteroid.getDistance(), asteroid.getAngle(), asteroid.getDiameter(), asteroid.getColor());
                asteroids[x].setAngle((asteroids[x].getAngle() + 1) % 360);
            }

            /**
            * Drawing saturns rings
             **/

            for (int x = 0; x < 20; x++) {
                Moon ring = rings[x];
                mySystem.drawSolarObjectAbout(ring.getDistance(), ring.getAngle(), ring.getDiameter(), ring.getColor(), ring.getRotationDistance(), ring.getRotationAngle());
                rings[x].setAngle((rings[x].getAngle() + 1) % 360);
                rings[x].setRotationAngle((theSaturn.getAngle() + 1) % 360 );

            }

            mySystem.finishedDrawing();
        }
    }
}
