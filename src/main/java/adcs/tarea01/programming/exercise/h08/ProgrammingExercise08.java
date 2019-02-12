package adcs.tarea01.programming.exercise.h08;

import adcs.tarea01.programming.exercise.d04.ProgrammingExercise04;
import java.util.Arrays;
import java.util.Collections;

public class ProgrammingExercise08 {

    public static void main(String[] args) {
        Double[] numbers = new Double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};

        double mean = calculateMean(numbers);
        System.out.println("mean : " + mean);

        double standardDeviation = calculateStandardDeviation(numbers);
        System.out.println("standardDeviation : " + standardDeviation);

        double median = calculateMedian(numbers);
        System.out.println("median : " + median);

        double interquartileRange = calculateInterquartileRange(numbers);
        System.out.println("interquartileRange : " + interquartileRange);

        double percentil = calculatePercentile(50, numbers);
        System.out.println("percentil: " + percentil);
    }

    public static double calculateMean(Double... numbers) {
        double mean = 0, sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        mean = sum / numbers.length;
        return mean;
    }

    public static double calculateStandardDeviation(Double... numbers) {
        return ProgrammingExercise04.calculateStandardDeviation(Arrays.asList(numbers));
    }

    public static double calculateMedian(Double... numbers) {
        Arrays.sort(numbers);
        double median;
        // get count of scores
        int totalElements = numbers.length;
        // check if total number of scores is even
        if (totalElements % 2 == 0) {
            double sumOfMiddleElements = numbers[totalElements / 2] + numbers[totalElements / 2 - 1];
            // calculate average of middle elements
            median = ((double) sumOfMiddleElements) / 2;
        } else {
            // get the middle element
            median = (double) numbers[numbers.length / 2];
        }
        return median;
    }

    //https://www.geeksforgeeks.org/interquartile-range-iqr/
    public static double calculateInterquartileRange(Double... numbers) {
        Arrays.sort(numbers);

        // Index of median of entire data
        int mid_index = median(0, numbers.length);

        // Median of first half
        double Q1 = numbers[median(0, mid_index)];

        // Median of second half
        double Q3 = numbers[median(mid_index + 1, numbers.length)];

        // IQR calculation
        return (Q3 - Q1);
    }

    // Function to give index of the median
    public static int median(int l, int r) {
        int n = r - l + 1;
        n = (n + 1) / 2 - 1;
        return n + l;
    }

    //https://stackoverflow.com/questions/41413544/calculate-percentile-from-a-long-array
    public static double calculatePercentile(double percentile, Double ... numbers) {
        Collections.sort(Arrays.asList(numbers));
        int index = (int) Math.ceil(( percentile / (double) 100) * (double) numbers.length);
        return numbers[index - 1];
    }

}
