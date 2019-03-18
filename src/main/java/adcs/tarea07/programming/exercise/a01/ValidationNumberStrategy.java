package adcs.tarea07.programming.exercise.a01;

import java.util.InputMismatchException;

public class ValidationNumberStrategy implements ValidationStrategy {

    @Override
    public Object execute(Object object) {
        Integer userNumber;
        try {
            userNumber = (int)new Context(new ReadConsoleInteger()).executeStrategy(new Object());
            if (!(userNumber > 0 && userNumber <= 9)) {
                System.out.println("Invalid input; re-enter slot number:");
                return -1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input; re-enter slot number:");
            return -1;
        }
        return userNumber;
    }

}
