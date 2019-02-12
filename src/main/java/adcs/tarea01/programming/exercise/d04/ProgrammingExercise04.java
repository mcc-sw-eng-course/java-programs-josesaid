package adcs.tarea01.programming.exercise.d04;

import java.util.Arrays;
import java.util.List;

public class ProgrammingExercise04 {

    public static void main(String[] args) {
        List<Double> numbers = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0);
        double result = calculateStandardDeviation(numbers);
        System.out.println("StandardDeviation: " + result);
    }

    public static double calculateStandardDeviation(List<Double> numbers) {
        double sum = 0.0, standardDeviation = 0.0;
        for (double number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.size();
        for (double num : numbers) {
            standardDeviation += pow(num - mean, 2);
        }
        return squareRoot(standardDeviation / numbers.size());
    }

    private static double pow(double base, double exponent) {
        long result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }

    private static double squareRoot(double number){
        double t;
        double squareRoot = number/2;
        do {
            t = squareRoot;
            squareRoot = (t+(number/t))/ 2;
        }while ((t - squareRoot) != 0);
        return squareRoot;
    }

}
