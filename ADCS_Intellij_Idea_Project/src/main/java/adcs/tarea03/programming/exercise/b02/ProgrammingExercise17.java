package main.java.adcs.tarea03.programming.exercise.b02;

public class ProgrammingExercise17 {

    public long factorial(long number) {
        if (number <= 1) return 1;
        else return number * factorial(number - 1);
    }

}
