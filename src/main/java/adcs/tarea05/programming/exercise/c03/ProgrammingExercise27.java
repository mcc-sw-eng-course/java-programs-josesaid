package adcs.tarea05.programming.exercise.c03;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;

public class ProgrammingExercise27 {

    public static void main(String[] args) throws Exception {
        FilesystemPowerList myFilesystemPowerList = new FilesystemPowerList();
        myFilesystemPowerList.setInputData("C:\\temp\\fiveRecords.txt");
        myFilesystemPowerList.executeMergeSort();
        myFilesystemPowerList.setOutputData("C:\\temp\\outputFile.txt");
    }

}
