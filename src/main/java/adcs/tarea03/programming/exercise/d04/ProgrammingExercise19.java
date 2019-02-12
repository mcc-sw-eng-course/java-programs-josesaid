package adcs.tarea03.programming.exercise.d04;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class ProgrammingExercise19 {

    public boolean equalsContentFiles(File file1, File file2) throws IOException {
        return FileUtils.contentEquals(file1, file2);
    }
}
