package adcs.tarea04.programming.exercise.tarea04.d04;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import adcs.tarea02.programming.exercise.f06.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * This class is the  Programming Exercise 24 used to test the
 * Programming Exercise 15
 */
public class ProgrammingExercise24Test {
    private static final String AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO = "C:\\temp\\personajesCineMexicano.txt";
    MyPowerList<Person> agenda;

    @Before
    public void setup(){
        agenda = new MyPowerList();
    }

    @Test
    public void testCreateRecord(){
        agenda.add(new Person("Juan Camaney", "Calle de la viuda sin numero", "1234567890", "juan.camaney@cinedeoro.com.mx"));
        agenda.add(new Person("Mauricio Garces", "Calle - modisto de señoras copetonas", "9876543210", "modisto.de.rucas@eltodasmias.com"));
        assertEquals(agenda.size(), 2);
    }

    @Test
    public void testSaveRecordsInFile(){
        agenda.add(new Person("Juan Camaney", "Calle de la viuda sin numero", "1234567890", "juan.camaney@cinedeoro.com.mx"));
        agenda.add(new Person("Mauricio Garces", "Calle - modisto de señoras copetonas", "9876543210", "modisto.de.rucas@eltodasmias.com"));
        agenda.saveToFile(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO);
        assertTrue(new File(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO).exists());
    }

    @Test
    public void testLoadRecordsFromFile() throws IOException {
        agenda.readPeopleFromFile(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO);
    }

    @Test(expected = FileNotFoundException.class)
    public void testLoadRecordsFromNotExistingFile() throws IOException {
        agenda.readPeopleFromFile("C:\\unknownFile.txt"); }

    @Test
    public void testSearchRecordFromFile() throws IOException {
        agenda.add(new Person("Said Olano", "Av Aviacion sin Numero", "9876543210", "josesaid@gmail.com"));
        agenda.saveToFile(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO);
        List<Person> people = agenda.findByName("Said Olano");
        assertEquals(people.iterator().next().getName(), "Said Olano");
    }

    @Test
    public void testSearchNotExistingRecordFromFile(){
        List<Person> people = agenda.findByName("Juana la cubana");
        assertEquals(people.size(), 0);
    }

    @Test
    public void testLookUpRecordFromFile(){
        agenda.add(new Person("Mauricio Garces", "Calle - modisto de señoras copetonas", "9876543210", "modisto.de.rucas@eltodasmias.com"));
        List<Person> people = agenda.findByName("Mauricio Garces");
        assertEquals(people.get(0).getPhone(), "9876543210");
    }

    @After
    public void cleanUp(){
        agenda.clear();
    }
}
