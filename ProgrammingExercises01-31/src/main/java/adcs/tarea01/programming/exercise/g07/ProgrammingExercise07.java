package adcs.tarea01.programming.exercise.g07;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class ProgrammingExercise07 {

    public ProgrammingExercise07(){
        crunchifyValueObj = new ArrayList<>();

        // Adding ASCII Decimal value between 33 and 53
        for (int i = 33; i < 53; i++) {
            crunchifyValueObj.add((char) i);
        }

        // Adding ASCII Decimal value between 54 and 85
        for (int i = 54; i < 85; i++) {
            crunchifyValueObj.add((char) i);
        }

        // Adding ASCII Decimal value between 86 and 128
        for (int i = 86; i < 127; i++) {
            crunchifyValueObj.add((char) i);
        }
        crunchifyValueObj.add((char) 64);
        // rotate() rotates the elements in the specified list by the specified distance. This will create strong password
        Collections.rotate(crunchifyValueObj, 5);
    }

    public char crunchifyGetRandom() {
        char crunchifyChar = (char) this.crunchifyValueObj.get(crunchifyRandomNo.nextInt(this.crunchifyValueObj.size()));
        return crunchifyChar;
    }

    private SecureRandom crunchifyRandomNo = new SecureRandom();
    private ArrayList<Object> crunchifyValueObj;

    public static void main(String[] args) {

        ProgrammingExercise07 passwordGenerator = new ProgrammingExercise07();

        StringBuilder crunchifyBuffer = new StringBuilder();

        // Let's print total 8 passwords
        for (int loop = 1; loop <= 8; loop++) {
            // Password length should be 23 characters
            for (int length = 0; length < 23; length++) {
                crunchifyBuffer.append(passwordGenerator.crunchifyGetRandom());
            }
            log(loop, crunchifyBuffer.toString());
            crunchifyBuffer.setLength(0);
        }
    }

    private static void log(String string) {
        System.out.println(string);
    }

    private static void log(int count, String password) {
        System.out.println("Password sample " + count + ": " + password);
    }

}
