package adcs.tarea05.programming.exercise.tarea05.a01;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.FileNotFoundException;

/**
 * This class is the  Programming Exercise 25 used to test the
 * Programming Exercise 25
 */
public class ProgrammingExercise25Test {
    private static final String SMALL_FILE = "C:\\temp\\smallFile.txt";
    private static final String MEDIUM_FILE = "C:\\temp\\mediumFile.txt";
    private static final String BIG_FILE = "C:\\temp\\bigFile.txt";
    private static final String HUGE_FILE = "C:\\temp\\hugeFile.txt";
    private static final String NO_EXISTING_FILE = "C:\\temp\\noExistingFile.txt";
    private static final String EMPTY_FILENAME = "";
    private static final String NULL_FILENAME = null;
    private static final String NOT_VALID_FILENAME = "some>>Name$%Wrong.txt";
    private static final String LONG_FILENAME = "aaaaabbbbbcccccdddddeeeeefffffggggg.txt";

    private FilesystemPowerList myFilesystemPowerList;

    @Before
    public void setup(){
        myFilesystemPowerList = new FilesystemPowerList();
    }

    @Test(expected = FileNotFoundException.class)
    public void testSetInputDataWithNonExistingFile() throws Exception {
        myFilesystemPowerList.setInputData(NO_EXISTING_FILE);
    }

    @Test(expected = Exception.class)
    public void testSetInputDataWithEmptyFileName() throws Exception {
        myFilesystemPowerList.setInputData(EMPTY_FILENAME);
    }

    @Test(expected = NullPointerException.class)
    public void testSetInputDataWithNullFileName() throws Exception {
        myFilesystemPowerList.setInputData(NULL_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetInputDataWithNotValidFileName() throws Exception {
        myFilesystemPowerList.setInputData(NOT_VALID_FILENAME);
    }

    @Test(expected = Exception.class)
    public void testSetInputDataWithLongFileName() throws Exception {
        myFilesystemPowerList.setInputData(LONG_FILENAME);
    }

    @After
    public void cleanUp(){
        myFilesystemPowerList.clear();
    }
}
