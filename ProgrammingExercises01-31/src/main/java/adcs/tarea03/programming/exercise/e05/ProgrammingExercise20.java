package adcs.tarea03.programming.exercise.e05;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProgrammingExercise20 {

    public Date time1AsDate() {
        return new Date();
    }

    public Long timeAsLong() {
        return System.currentTimeMillis();
    }

    public int getCurrentMonthNumber(){
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        return cal.get(Calendar.MONTH);
    }

    public int getCurrentYearNumber(){
        Calendar cal = new GregorianCalendar();
        cal.setTime(new Date());
        return cal.get(Calendar.YEAR);
    }

}
