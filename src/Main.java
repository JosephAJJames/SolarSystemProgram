package src;

public class Main
{
    public static void main(String[] args)
    {
        boolean play = true;
        boolean iterator = true;
        int earthAngle = 0;
        int moonAngle = 0;
        int moonAngleMax = (int)Math.toDegrees(50/400);
        SolarSystem mySystem = new SolarSystem(800, 800);
        while (play) {

            mySystem.drawSolarObject(0, 0, 150, "YELLOW");
            mySystem.drawSolarObject(300, earthAngle, 35, "BLUE");
            mySystem.finishedDrawing();
            if (!(earthAngle <= 360)) {
                earthAngle = 0;
            } else {
                earthAngle++;
            }

            if (iterator) {
                moonAngle++;
            } else {
                moonAngle--;
            }

            if (moonAngle > earthAngle) { // moon is on the right side of the earth

                if (moonAngle - earthAngle >= moonAngleMax) {
                    iterator = false;
                }

            } else if (moonAngle < earthAngle) { // moon is on the left side of the earth

                if (earthAngle - moonAngle >= moonAngleMax) {
                    iterator = true;
                }

            } else { // moon is directly above or below

            }

        }
    }
}
