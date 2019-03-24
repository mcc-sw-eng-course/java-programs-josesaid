package adcs.tarea03.programming.exercise.tarea03.b02;

import adcs.tarea03.programming.exercise.b02.ProgrammingExercise17;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProgrammingExercise17Test {
    private static final double DELTA = 1e-15;

    @Test
    public void testFactorialFunction(){
        long number = 5;
        double result = new ProgrammingExercise17().factorial(number);
        double oneHundredTwenty = 120.0;
        assertEquals(result, oneHundredTwenty, DELTA);
    }

    @Test
    public void testFactorialWrongExpectedValue(){
        long number = -1;
        double result = new ProgrammingExercise17().factorial(number);
        double oneHundredTwenty = 120.0;
        assertNotEquals(result, oneHundredTwenty);
    }

}
