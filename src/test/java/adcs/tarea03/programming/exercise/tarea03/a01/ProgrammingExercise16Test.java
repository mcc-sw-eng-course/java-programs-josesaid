package adcs.tarea03.programming.exercise.tarea03.a01;

import adcs.tarea03.programming.exercise.a01.ProgrammingExercise16;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ProgrammingExercise16Test {
    private static final double DELTA = 1e-15;

    @Test
    public void testCeilFunction(){
        double result = new ProgrammingExercise16().ceilFuntion(14.1d);
        double fifteen = 15.0;
        assertEquals(result, fifteen, DELTA);
    }

    @Test
    public void testCeilWrongExpectedValue(){
        double result = new ProgrammingExercise16().ceilFuntion(14.0d);
        double fifteen = 15.0;
        assertNotEquals(result, fifteen);
    }

}
