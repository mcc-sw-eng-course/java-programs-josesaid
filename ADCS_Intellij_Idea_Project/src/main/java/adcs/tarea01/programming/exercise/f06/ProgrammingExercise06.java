package main.java.adcs.tarea01.programming.exercise.f06;

public class ProgrammingExercise06 {

    public static void main(String[] args) {
        boolean isFibonnaci = isFibonnaciSerie(new int[]{ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34});
        System.out.println("It is Fibonnaci: " + isFibonnaci);
    }

    private static boolean isFibonnaciSerie(int ...fibonnaciNumbers){
        boolean isFibonnaci = true;
        for(int i=fibonnaciNumbers.length-1; i>=0 && i-2>=0 && isFibonnaci; i--){
            int preLast = fibonnaciNumbers[i-1];
            int prePreLast = fibonnaciNumbers[i-2];
            if(fibonnaciNumbers[i] == (preLast + prePreLast) ){
                isFibonnaci = true;
            }else{
                isFibonnaci = false;
            }
        }
        return isFibonnaci;
    }

}
