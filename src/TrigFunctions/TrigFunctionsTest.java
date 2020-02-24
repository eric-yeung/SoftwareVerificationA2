/*
Eric Yeung
104392784

Test cases with angles in all 4 quadrants,
answers were just tested vs a calculator

 */

package TrigFunctions;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TrigFunctionsTest
{
    TrigFunctions test = new TrigFunctions();
    //defining angles in all 4 quadrants
    double angle1 = 52;
    double angle2 = 164;
    double angle3 = 243;
    double angle4 = 296;

    double radAngle1 = 1.434;
    double radAngle2 = 2.146;
    double radAngle3 = 3.9011;
    double radAngle4 = 5.1456;

    @Test
    public void toRadiansTest()
    {
        double expAns1 = 0.907571211037111;
        double expAns2 = 2.8623399732708887;
        double expAns3 = 4.2411500823465;
        double expAns4 = 5.166174585903556;

        assertEquals(expAns1,test.toRadians(angle1));
        assertEquals(expAns2,test.toRadians(angle2));
        assertEquals(expAns3,test.toRadians(angle3));
        assertEquals(expAns4,test.toRadians(angle4));
    }

    @Test
    public void toDegreesTest()
    {
        double expAns1 = 82.16214782175464;
        double expAns2 = 122.95674283506656;
        double expAns3 = 223.51656545847072;
        double expAns4 = 294.82116306249696;

        assertEquals(expAns1, test.toDegrees(radAngle1));
        assertEquals(expAns2, test.toDegrees(radAngle2));
        assertEquals(expAns3, test.toDegrees(radAngle3));
        assertEquals(expAns4, test.toDegrees(radAngle4));
    }

//    @Test
//    public void sinRadiansTest()
//    {
//        double expAns1 = 0.990657964437774;
//        double expAns2 = 0.8390815204405422;
//        double expAns3 = -0.6885642684590729;
//        double expAns4 = -0.9076224856430537;
//
//        assertEquals(expAns1, test.sinRadians(radAngle1));
//        assertEquals(expAns2, test.sinRadians(radAngle2));
//        assertEquals(expAns3, test.sinRadians(radAngle3));
//        assertEquals(expAns4, test.sinRadians(radAngle4));
//    }
//
//    @Test
//    public void cosRadiansTest()
//    {
//        double expAns1 = 0.13637007551524744;
//        double expAns2 = -0.5440057003884181;
//        double expAns3 = -0.7251753223886787;
//        double expAns4 = 0.4197873551633533;
//
//        assertEquals(expAns1, test.cosRadians(radAngle1));
//        assertEquals(expAns2, test.cosRadians(radAngle2));
//        assertEquals(expAns3, test.cosRadians(radAngle3));
//        assertEquals(expAns4, test.cosRadians(radAngle4));
//    }
//
//    @Test
//    public void tanRadiansTest()
//    {
//        double expAns1 = 7.264482040467956;
//        double expAns2 = -1.5424131031006494;
//        double expAns3 = 0.9495142032563775;
//        double expAns4 = -2.1621005837345133;
//
//        assertEquals(expAns1, test.tanRadians(radAngle1));
//        assertEquals(expAns2, test.tanRadians(radAngle2));
//        assertEquals(expAns3, test.tanRadians(radAngle3));
//        assertEquals(expAns4, test.tanRadians(radAngle4));
//    }
//
//    @Test
//    public void sinDegTest()
//    {
//        double expAns1 = 0.7880107536067588;
//        double expAns2 = 0.27563735581681803;
//        double expAns3 = -0.8910065241884942;
//        double expAns4 = -0.8987940462990226;
//
//        assertEquals(expAns1,test.sinDeg(angle1));
//        assertEquals(expAns2,test.sinDeg(angle2));
//        assertEquals(expAns3,test.sinDeg(angle3));
//        assertEquals(expAns4,test.sinDeg(angle4));
//    }
//
//    @Test
//    public void cosDegTest()
//    {
//        double expAns1 = 0.6156614753256927;
//        double expAns2 = -0.9612616959383422;
//        double expAns3 = -0.45399049973939076;
//        double expAns4 = 0.43837114678929107;
//
//        assertEquals(expAns1, test.cosDeg(angle1));
//        assertEquals(expAns2, test.cosDeg(angle2));
//        assertEquals(expAns3, test.cosDeg(angle3));
//        assertEquals(expAns4, test.cosDeg(angle4));
//    }
//
//    @Test
//    public void tanDegTest()
//    {
//        double expAns1 = 1.279941632193067;
//        double expAns2 = -0.2867453857586125;
//        double expAns3 = 1.9626105055061034;
//        double expAns4 = -2.0503038415779677;
//
//        assertEquals(expAns1, test.tanDeg(angle1));
//        assertEquals(expAns2, test.tanDeg(angle2));
//        assertEquals(expAns3, test.tanDeg(angle3));
//        assertEquals(expAns4, test.tanDeg(angle4));
//    }
}