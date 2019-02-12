package adcs.tarea02.programming.exercise.f06;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import java.io.IOException;
import java.util.List;

public class ProgrammingExercise15 {
    private static final String AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO = "C:\\temp\\personajesCineMexicano.txt";

    public static void main(String[] args) throws IOException {
        MyPowerList<Person> agenda = new MyPowerList();
        agenda.add(new Person("Juan Camaney", "Calle de la viuda sin numero", "1234567890", "juan.camaney@cinedeoro.com.mx"));
        agenda.add(new Person("Mauricio Garces", "Calle - modisto de señoras copetonas", "9876543210", "modisto.de.rucas@eltodasmias.com"));
        agenda.saveToFile(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO);

        System.out.println("Registros escritos al archivo: " + agenda.size() );

        List<Person> people = agenda.readPeopleFromFile(AGENDA_ARTISTAS_Y_ACTRICES_CINE_MEXICANO);
        for (Person person : people){
            System.out.println("Registros leidos del archivo: " + person);
        }

        List result = agenda.findByName("Juan");
        System.out.println("Obtenidos en la agenda, estos registros: " + result);

        result = agenda.findByName("Gerardo Padilla");
        System.out.println("Obtenidos en la agenda, estos registros: " + result);
    }

}
