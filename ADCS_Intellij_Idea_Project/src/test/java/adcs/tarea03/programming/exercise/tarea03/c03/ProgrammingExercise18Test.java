package test.java.adcs.tarea03.programming.exercise.tarea03.c03;

import main.java.adcs.tarea03.programming.exercise.c03.ProgrammingExercise18;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ProgrammingExercise18Test {

    @Test
    public void testPowFunction(){
        ProgrammingExercise18 exercise18 = new ProgrammingExercise18();
        Double result = exercise18.pow(2d,3d);
        Double eight = 8.0;
        assertEquals(result, eight);
    }

    @Test
    public void testPowSmallNumber(){
        ProgrammingExercise18 exercise18 = new ProgrammingExercise18();
        double result = exercise18.pow(2d,.5);
        assertTrue(result >= 1.2);
    }

    @Test
    public void testPowWithZeroValues(){
        ProgrammingExercise18 exercise18 = new ProgrammingExercise18();
        double result = exercise18.pow(0,0);
        assertTrue(result == 1);
    }

}
