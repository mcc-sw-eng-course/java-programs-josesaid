package adcs.tarea06.programming.exercise.tarea06.c03;

import adcs.tarea06.programming.exercise.c03.ProgrammingExercise30;
import org.junit.Before;
import org.junit.Test;

/**
 * This class is the Programming Exercise  used to test the
 * Programming Exercise 30
 */
public class ProgrammingExercise30Test {

    private ProgrammingExercise30 programmingExercise30;

    @Before
    public void setup(){
        programmingExercise30 = new ProgrammingExercise30();
    }

    @Test
    public void testMergeSort() throws Exception {
        programmingExercise30.mergeSort();
    }

    @Test
    public void testQuickSort() throws Exception {
        programmingExercise30.quickSort();
    }

    @Test
    public void testHeapSort() throws Exception {
        programmingExercise30.heapSort();
    }

}
