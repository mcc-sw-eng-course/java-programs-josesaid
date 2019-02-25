package adcs.tarea05.programming.exercise.a01;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import adcs.tarea02.programming.exercise.f06.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;

public class FilesystemPowerList extends MyPowerList<String> {

    private static final String VALID_FILENAME_REGEX = "[a-zA-Z0-9_-]+\\.[a-zA-Z0-9]+";

    public void setInputData(String fullFileName) throws Exception {
        File file = new File(fullFileName);
        String fileName = file.getName();

        if(fileName.length()==0){
            throw new Exception("The length of file can not be zero");
        }
        if(!file.exists()){
            throw new FileNotFoundException("The awesome file does not exist !");
        }
        if(fileName.length()<=4){
            throw new Exception("The filename must be at least 5 chars (A.TXT) e.g.");
        }
        if(fileName == null){
            throw new NullPointerException("The file: " + fileName+" is null");
        }
        if(!fileName.matches(VALID_FILENAME_REGEX)){
            throw new Exception("The filename: "  + fileName + " <<-- is not valid");
        }
        if(fileName.length() > 30){
            throw new Exception("The length of the filename must be shorter than 30. Currently it has: " + fileName.length());
        }

        List<Person> people = this.readPeopleFromFile(fullFileName);
        for (Person p: people){
            System.out.println(p);
        }
        System.out.println("Number of people found: " + people.size());
    }

}
