/*
Eric Yeung
104392784

Creating trig functions from scratch
Sin function was created from the taylor series
Cos and Tan functions were created from trig identities
 */

package TrigFunctions;

public class TrigFunctions
{
    public static final double PI = 3.14159265359;

    //Method to convert degrees to radians
    public double toRadians(double deg)
    {
        double value = deg * (PI / 180);
        return value;
    }

    //Method to convert radians to degrees
    public double toDegrees(double rad)
    {
        double value = rad * (180 / PI);
        return value;
    }


}
