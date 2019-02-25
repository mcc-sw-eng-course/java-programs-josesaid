package adcs.tarea05.programming.exercise.tarea05.b02;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


/**
 * This class is the  Programming Exercise 26 used to test the
 * Programming Exercise 26
 */
public class ProgrammingExercise26Test {
    private static final String EMPTY_FILENAME = "";
    private static final String NULL_FILENAME = null;
    private static final String NOT_VALID_FILENAME = "some>>Name$%Wrong.txt";
    private static final String LONG_FILENAME = "aaaaabbbbbcccccdddddeeeeefffffggggg.txt";

    private FilesystemPowerList myFilesystemPowerList;

    @Before
    public void setup(){
        myFilesystemPowerList = new FilesystemPowerList();
    }

    @Test(expected = Exception.class)
    public void testSetOutputDataWithEmptyFileName() throws Exception {
        myFilesystemPowerList.setOutputData(EMPTY_FILENAME);
    }

    @Test(expected = NullPointerException.class)
    public void testSetOutputDataWithNullFileName() throws Exception {
        myFilesystemPowerList.setInputData(NULL_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetOutputDataWithNotValidFileName() throws Exception {
        myFilesystemPowerList.setInputData(NOT_VALID_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetOutputDataWithLongFileName() throws Exception {
        myFilesystemPowerList.setInputData(LONG_FILENAME);
    }

    @After
    public void cleanUp(){
        myFilesystemPowerList.clear();
    }
}
