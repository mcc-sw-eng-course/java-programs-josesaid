package test.java.adcs.tarea03.programming.exercise.tarea03.d04;

import main.java.adcs.tarea03.programming.exercise.d04.ProgrammingExercise19;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ProgrammingExercise19Test {

    @Test
    public void testFileCompareFunction() throws IOException {
        ProgrammingExercise19 exercise19 = new ProgrammingExercise19();
        File file1 = new File("c:\\temp\\personajesCineMexicano.txt");
        File file2 = new File("c:\\temp\\personajesCineMexicano.txt");
        boolean equalFiles = exercise19.equalsContentFiles(file1, file2);
        assertEquals(equalFiles, true);
    }

    @Test
    public void testFileCompareOneNonExistingFile() throws IOException {
        ProgrammingExercise19 exercise19 = new ProgrammingExercise19();
        File file1 = new File("c:\\temp\\personajesCineMexicano.txt");
        File file2 = new File("c:\\temp\\nonExistingFile");
        boolean equalFiles = exercise19.equalsContentFiles(file1, file2);
        assertTrue(!equalFiles);
    }

    @Test(expected = NullPointerException.class)
    public void testFileCompareNullFiles() throws IOException {
        ProgrammingExercise19 exercise19 = new ProgrammingExercise19();
        File file1 = null;
        File file2 = null;
        assertNotNull(exercise19.equalsContentFiles(file1, file2)); }
}
