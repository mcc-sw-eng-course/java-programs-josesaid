package main.java.adcs.tarea02.programming.exercise.b02;

import main.java.adcs.tarea02.programming.exercise.a01.MyPowerList;

public class ProgrammingExercise11 {

    public static void main(String[] args) {
        int []sortedItems = new MyPowerList().mySortMethod(new int[]{10,2,9,4,8,6,3});
        for(int item: sortedItems){
            System.out.print(item + " ");
        }
    }

}
