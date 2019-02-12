package adcs.tarea03.programming.exercise.tarea03.e05;

import adcs.tarea03.programming.exercise.e05.ProgrammingExercise20;
import org.junit.Test;
import java.util.Date;
import static junit.framework.TestCase.assertTrue;

public class ProgrammingExercise20Test {
    private ProgrammingExercise20 exercise20 = new ProgrammingExercise20();

    @Test
    public void testTimeFunction(){
        Date time = exercise20.time1AsDate();
        assertTrue(time != null);
    }

    @Test
    public void testTimeAtMillisFunction(){
        Long time = exercise20.timeAsLong();
        assertTrue(time != null);
    }

    @Test
    public void testGetCurrentMonthNumber(){
        int month = exercise20.getCurrentMonthNumber();
        int february = 1;
        assertTrue(month == february);
    }

    @Test
    public void testGetCurrentYearNumber(){
        int year = exercise20.getCurrentYearNumber();
        int currentYear = 2019;
        assertTrue(year == currentYear);
    }

}
