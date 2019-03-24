package adcs.tarea07.programming.exercise.a01;

import java.util.Scanner;

public class ReadConsoleInteger implements ReadStrategy {
    private Scanner instance;

    public ReadConsoleInteger() {
        instance = new Scanner(System.in);
    }

    @Override
    public Object execute(Object object) {
        return instance.nextInt();
    }
}
