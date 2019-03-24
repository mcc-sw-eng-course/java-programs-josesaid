package adcs.tarea02.programming.exercise.e05;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import java.io.IOException;
import java.util.List;

public class ProgrammingExercise14 {

    public static void main(String[] args) throws IOException {
        MyPowerList list = new MyPowerList();
        List values = list.readPeopleFromFile("C:\\temp\\output.txt");
        for(Object item:  values){
            System.out.println("--> " + item);
        }
    }

}
