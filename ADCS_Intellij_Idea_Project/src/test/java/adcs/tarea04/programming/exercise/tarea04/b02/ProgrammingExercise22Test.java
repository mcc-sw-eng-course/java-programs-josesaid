package test.java.adcs.tarea04.programming.exercise.tarea04.b02;

import main.java.adcs.tarea01.programming.exercise.i09.ProgrammingExercise09;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class is the  Programming Exercise 22 used to test the
 * Programming Exercise 09
 */
public class ProgrammingExercise22Test {

    private ProgrammingExercise09 exercise09;

    @Before
    public void setup() {
        exercise09 = new ProgrammingExercise09();
    }

    @Test
    public void testToRoman() throws Exception {
        String romanNumber = exercise09.toRoman(10);
        assertEquals(romanNumber, "X");
    }

    @Test(expected = Exception.class)
    public void testToRomanNegativeNumber() throws Exception {
        exercise09.toRoman(-5); }

}
