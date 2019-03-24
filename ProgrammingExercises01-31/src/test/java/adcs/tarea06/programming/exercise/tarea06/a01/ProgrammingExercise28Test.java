package adcs.tarea06.programming.exercise.tarea06.a01;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;


/**
 * This class is the  Programming Exercise 28 used to test the
 * Programming Exercise 28
 */
public class ProgrammingExercise28Test {
    private static final String FIVE_RECORDS_FILE = "C:\\temp\\fiveRecords.txt";
    private static final String SMALL_FILE = "C:\\temp\\smallFile.txt";
    private static final String NO_EXISTING_FILE = "C:\\temp\\noExistingFile.txt";
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
    public void testSetInputData() throws Exception {
        myFilesystemPowerList.setInputData(SMALL_FILE);
    }

    @Test
    public void testExecuteHeapSort() throws Exception {
        myFilesystemPowerList.setInputData(FIVE_RECORDS_FILE);
        myFilesystemPowerList.executeHeapSort();
        myFilesystemPowerList.setOutputData(VALID_FILENAME);
    }

    @Test
    public void testSetOutputData() throws Exception {
        myFilesystemPowerList.setInputData(FIVE_RECORDS_FILE);
        myFilesystemPowerList.setOutputData(VALID_FILENAME);
    }

    @After
    public void cleanUp(){
        myFilesystemPowerList.clear();
    }

}
