package workshop.test;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SleepInTest {

     static SleepIn sleepInt;

    @BeforeClass
     public static void  zainicjalizuj () {
        sleepInt= new SleepIn();
    }

    @Test
    public void sleepIn() {
        boolean a=false;
        boolean b=false;
        boolean expectedValue=true;
        boolean output= sleepInt.sleepIn(a,b);
        assertEquals(expectedValue, output);
    }

    @Test
    public void sleepIn2() {
        boolean a=true;
        boolean b=false;
        boolean expectedValue=false;
        boolean output=  new SleepIn().sleepIn(a, b);
        assertEquals(expectedValue, output);
    }
    @Test
    public void sleepIn3() {
        boolean a=false;
        boolean b=true;
        boolean expectedValue=true;
        boolean output= new SleepIn().sleepIn (a, b);
        assertEquals(expectedValue, output);
    }
    @Test
    public void sleepIn4() {
        assertEquals(true, new SleepIn().sleepIn(true, true));
    }





}