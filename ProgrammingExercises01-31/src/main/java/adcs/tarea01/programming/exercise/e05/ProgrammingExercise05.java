package adcs.tarea01.programming.exercise.e05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgrammingExercise05 {
    public static void main(String[] args) {
        int length = 0;
        try {
            System.out.println("How may Fibonnaci numbers you want to generate?");
            String number = new BufferedReader(new InputStreamReader(System.in)).readLine();
            length = Integer.parseInt(number);
            int fibonnaci = generateFibonnaciNumbers(length);
            System.out.println("The Fibonnaci for the first " + length + " numbers is: " + fibonnaci);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int generateFibonnaciNumbers(int size) {
        StringBuilder sb = new StringBuilder();
        int t1 = 0, t2 = 1;
        System.out.print("First " + size + " terms: ");
        for (int i = 1; i <= size; ++i) {
            sb.append(t1).append(" + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println(sb.toString().substring(0, sb.toString().length()-2));
        return t2;
    }
}
