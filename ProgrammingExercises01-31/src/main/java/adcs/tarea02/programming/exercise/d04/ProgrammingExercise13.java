package adcs.tarea02.programming.exercise.d04;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import java.io.IOException;
import java.util.List;

public class ProgrammingExercise13 {
    public static void main(String[] args) throws IOException {
        MyPowerList list = new MyPowerList();
        list.add("100");
        list.add("101");
        list.add("102");
        list.saveToFile();
        List<String[]> data = list.readFromFile("C:\\temp\\output.txt");
        System.out.println(data);
    }

}
