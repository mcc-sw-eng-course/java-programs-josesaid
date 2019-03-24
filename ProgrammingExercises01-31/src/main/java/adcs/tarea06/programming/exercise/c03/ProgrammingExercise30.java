package adcs.tarea06.programming.exercise.c03;

import adcs.tarea05.programming.exercise.a01.FilesystemPowerList;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.util.Date;

public class ProgrammingExercise30 {

    public static void main(String ... saidWasHere) throws Exception {
        ProgrammingExercise30 instance = new ProgrammingExercise30();
        instance.mergeSort();
        instance.quickSort();
        instance.heapSort();
    }

    public void mergeSort() throws Exception {
        System.out.println("***********************************************************");
        Instant before = Instant.now();
        System.out.println("Start Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        FilesystemPowerList myFilesystemPowerList01 = new FilesystemPowerList();
        myFilesystemPowerList01.setInputData("C:\\temp\\OneHundredRecords.txt");
        myFilesystemPowerList01.executeMergeSort();
        myFilesystemPowerList01.setOutputData("C:\\temp\\outputFile_MergeSort.txt");
        int size01 = myFilesystemPowerList01.getTotalRecordsSorted();
        System.out.println("Records Sorted[Merge Sort]: " + size01 );
        System.out.println("End Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        Instant after = Instant.now();
        System.out.println("Time Consumed: " + Duration.between(before, after).toMillis());
    }

    public void quickSort() throws Exception {
        System.out.println("***********************************************************");
        Instant before = Instant.now();
        System.out.println("Start Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        FilesystemPowerList myFilesystemPowerList02 = new FilesystemPowerList();
        myFilesystemPowerList02.setInputData("C:\\temp\\OneHundredRecords.txt");
        myFilesystemPowerList02.executeQuickSort();
        myFilesystemPowerList02.setOutputData("C:\\temp\\outputFile_QuickSort.txt");
        int size02 = myFilesystemPowerList02.getTotalRecordsSorted();
        System.out.println("Records Sorted[Quick Sort]: " + size02 );
        System.out.println("End Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        Instant after = Instant.now();
        System.out.println("Time Consumed: " + Duration.between(before, after).toMillis());
    }

    public void heapSort() throws Exception {
        System.out.println("***********************************************************");
        Instant before = Instant.now();
        System.out.println("Start Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        FilesystemPowerList myFilesystemPowerList03 = new FilesystemPowerList();
        myFilesystemPowerList03.setInputData("C:\\temp\\OneHundredRecords.txt");
        myFilesystemPowerList03.executeHeapSort();
        myFilesystemPowerList03.setOutputData("C:\\temp\\outputFile_HeapSort.txt");
        int size03 = myFilesystemPowerList03.getTotalRecordsSorted();
        System.out.println("Records Sorted[Heap Sort]: " + size03 );
        System.out.println("End Time: " + new SimpleDateFormat("HH:mm:ss:SSS").format(new Date()));
        Instant after = Instant.now();
        System.out.println("Time Consumed: " + Duration.between(before, after).toMillis());
        System.out.println("***********************************************************");
    }

}
