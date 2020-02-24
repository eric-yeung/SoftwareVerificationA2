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

    public double sinRadians(double rad)
    {
        /*convert the radians so it is within -2pi and 2pi bc otherwise
        the taylor series would calculate beyond 2pi and that could take a long time
         */
        rad = rad % (2 *PI);

        double term = 1.0; //the ith term = x^i / i!
        double sum = 0.0; // sum of the first i terms in the series

        for(int i = 1; term != 0.0; i++)
        {
            term *= (rad / i);

            if(i % 4 == 1) //this checks for the term to be added
            {
                sum += term;
            }

            if (i % 4 == 3) //this checks for the term to be subtracted
            {
                sum -= term;
            }
        }
        return sum;
    }

    public double cosRadians(double rad)
    {
        rad = (PI/2) - rad; //since we know cos is related to sin as cos x = sin (pi/2 - x), we can reuse sin to calculate cos
        double cosValue = sinRadians(rad);
        return cosValue;
    }

    public double tanRadians(double rad)
    {
        double tanValue = sinRadians(rad)/cosRadians(rad); //tan x = sin x/ cos x
        return tanValue;
    }

}
