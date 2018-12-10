package workshop.test;

import org.junit.Test;
import service.MathService;

import static org.junit.Assert.*;

public class MathTest {


    @Test
    public void multiply() {
        MathService math = new MathService();
        int a=3, b=4;
        int expectedValue=12;
        int actualOutput = math.multiply(a,b);
        assertEquals(expectedValue, actualOutput);
    }
}