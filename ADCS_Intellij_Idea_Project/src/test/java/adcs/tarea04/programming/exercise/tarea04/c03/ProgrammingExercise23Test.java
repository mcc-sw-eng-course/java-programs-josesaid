package test.java.adcs.tarea04.programming.exercise.tarea04.c03;

import main.java.adcs.tarea02.programming.exercise.a01.MyPowerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;

/**
 * This class is the  Programming Exercise 23 used to test the
 * Programming Exercise 14
 */
public class ProgrammingExercise23Test {

    private MyPowerList list;
    private String fileName;

    @Before
    public void setup(){
        list = new MyPowerList();
        fileName = "C:\\temp\\output.txt";
        new File(fileName).delete();
    }

    @Test(expected = FileNotFoundException.class)
    public void testReadFromNotExistingFile() throws IOException {
        list.readPeopleFromFile(fileName); }

    @Test
    public void testReadFromFile() throws IOException {
        list.add("100");
        list.add("101");
        list.add("102");
        list.saveToFile();
        List<String[]> lines = list.readFromFile(fileName);
        String[] record = null;
        for(int i=0; i < lines.size();i++){
            record = lines.get(i);
            for(String item :record){
                item = item.replace("[","").replace("]","").trim();
            }
        }
        assertEquals(lines.size(), 1);
        assertEquals(record.length, 3);
    }

    @Test
    public void testReadWrongTextFormatFromFile() throws IOException {
        list.add("a");
        list.add("jfk");
        list.add("XHGC");
        list.add("8");
        list.saveToFile();
        List<String[]> lines = list.readFromFile(fileName);
        String[] record = null;
        for(int i=0; i < lines.size();i++){
            record = lines.get(i);
            for(String item :record){
                item = item.replace("[","").replace("]","").trim();
            }
        }
        assertEquals(lines.size(), 1);
        assertEquals(record.length, 4);
    }

    @Test
    public void testReadEmptyListFromFile() throws IOException {
        list.clear();
        list.saveToFile();
        List<String[]> lines = list.readFromFile(fileName);
        String[] record = null;
        for(int i=0; i < lines.size();i++){
            record = lines.get(i);
            for(String item :record){
                item = item.replace("[","").replace("]","").trim();
            }
        }
        assertEquals(lines.size(), 1);
        assertEquals(record.length, 1);
    }

    @After
    public void cleanUp(){
        new File(fileName).delete();
    }

}
