package workshop.test.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import service.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MathAppTest {

    @Mock
    MathService mathService;

     @InjectMocks
     MathApp mathApp= new MathApp();

    @Test
    public void multiplyBy() {
        when(mathService.multiply(10,20)).thenReturn(200);
        assertEquals(200, mathApp.multiplyBy(10,20));
    }
}