package test.java.adcs.tarea04.programming.exercise.tarea04.a01;

import main.java.adcs.tarea01.programming.exercise.h08.ProgrammingExercise08;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * This class is the  Programming Exercise 21 used to test the
 * Programming Exercise 08
 */
public class ProgrammingExercise21Test {

    private ProgrammingExercise08 exercise08;
    private Double [] numbers;

    @Before
    public void setup(){
        exercise08 = new ProgrammingExercise08();
        numbers = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
    }

    @Test
    public void testCalculateMean(){
        Double mean = exercise08.calculateMean(numbers);
        Double expected = 5.5d;
        assertEquals(mean, expected);
    }

    @Test
    public void testCalculateStandardDeviation(){
        Double standardDeviation = exercise08.calculateStandardDeviation(numbers);
        Double expected = 2.6076809620810595d;
        assertEquals(standardDeviation, expected);
    }

    @Test
    public void testCalculateMedian(){
        Double median = exercise08.calculateMedian(numbers);
        Double expected = 5.5d;
        assertEquals(median, expected);
    }

    @Test
    public void testCalculateInterquartileRange(){
        Double interquartileRange = exercise08.calculateInterquartileRange(numbers);
        Double expected = 6.0d;
        assertEquals(interquartileRange, expected);
    }

    @Test
    public void calculateMedian(){
        Integer median = exercise08.median(2,6);
        Integer expected = 4;
        assertEquals(median, expected);
    }

    @Test
    public void calculatePercentile(){
        Double percentile = exercise08.calculatePercentile(20, numbers);
        Double expected = 2.0d;
        assertEquals(percentile, expected);
    }

}
