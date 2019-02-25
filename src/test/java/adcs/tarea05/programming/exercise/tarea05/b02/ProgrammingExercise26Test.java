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
    private static final String VALID_FILENAME = "C:\\temp\\outputFileName.txt";

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
        myFilesystemPowerList.setOutputData(NULL_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetOutputDataWithNotValidFileName() throws Exception {
        myFilesystemPowerList.setOutputData(NOT_VALID_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetOutputDataWithLongFileName() throws Exception {
        myFilesystemPowerList.setOutputData(LONG_FILENAME);
    }

    @Test
    public void testSetOutputData() throws Exception {
        myFilesystemPowerList.setOutputData(VALID_FILENAME);
    }

    @After
    public void cleanUp(){
        myFilesystemPowerList.clear();
    }
}
