package adcs.tarea06.programming.exercise.a01;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;

public class ProgrammingExercise28 {

    public static void main(String[] args) throws Exception {
        FilesystemPowerList myFilesystemPowerList = new FilesystemPowerList();
        myFilesystemPowerList.setInputData("C:\\temp\\fiveRecords.txt");
        myFilesystemPowerList.executeHeapSort();
        myFilesystemPowerList.setOutputData("C:\\temp\\outputFile.txt");
    }

}
