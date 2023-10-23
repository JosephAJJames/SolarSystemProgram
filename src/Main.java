package src;

public class Main
{
    public static void main(String[] args)
    {
        boolean play = true;
        int earthAngle = 0;
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
        }
    }
}
