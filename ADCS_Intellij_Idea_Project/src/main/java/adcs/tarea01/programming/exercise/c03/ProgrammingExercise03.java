package main.java.adcs.tarea01.programming.exercise.c03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgrammingExercise03 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5);
        System.out.println("ArrayList with duplicates: " + list);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.println("ArrayList with duplicates removed: " + newList);
    }

    public static <T> ArrayList<T> removeDuplicates(List<T> list) {
        ArrayList<T> newList = new ArrayList<T>();
        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

}
