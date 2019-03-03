package adcs.tarea05.programming.exercise.a01;

import adcs.tarea02.programming.exercise.a01.MyPowerList;
import adcs.tarea02.programming.exercise.f06.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

public class FilesystemPowerList extends MyPowerList<String> {
    private List<Person> peopleList;
    private static final String VALID_FILENAME_REGEX = "[a-zA-Z0-9_-]+\\.[a-zA-Z0-9]+";

    public void setInputData(String fullFileName) throws Exception {
        File file = new File(fullFileName);
        String fileName = file.getName();

        if (fileName.length() == 0) {
            throw new Exception("The length of file can not be zero");
        }
        if (!file.exists()) {
            throw new FileNotFoundException("The awesome file does not exist !");
        }
        if (fileName.length() <= 4) {
            throw new Exception("The filename must be at least 5 chars (A.TXT) e.g.");
        }
        if (fileName == null) {
            throw new NullPointerException("The file: " + fileName + " is null");
        }
        if (!fileName.matches(VALID_FILENAME_REGEX)) {
            throw new Exception("The filename: " + fileName + " <<-- is not valid");
        }
        if (fileName.length() > 30) {
            throw new Exception("The length of the filename must be shorter than 30. Currently it has: " + fileName.length());
        }
        peopleList = this.readPeopleFromFile(fullFileName);
        System.out.println("Number of people read in file: " + peopleList.size());
    }

    public void setOutputData(String outputFileName) throws Exception {
        File file = new File(outputFileName);
        String fileName = file.getName();

        if (fileName.length() == 0) {
            throw new Exception("The length of file can not be zero");
        }

        if (fileName.length() <= 4) {
            throw new Exception("The filename must be at least 5 chars (A.TXT) e.g.");
        }
        if (fileName == null) {
            throw new NullPointerException("The file: " + fileName + " is null");
        }
        if (!fileName.matches(VALID_FILENAME_REGEX)) {
            throw new Exception("The filename: " + fileName + " <<-- is not valid");
        }
        if (fileName.length() > 30) {
            throw new Exception("The length of the filename must be shorter than 30. Currently it has: " + fileName.length());
        }
        clear();
        addAll(peopleList);
        saveToFile(outputFileName);
    }

    static int counter = 0;

    public void executeMergeSort() {
        this.executeMergeSort(getPeople());
    }

    //https://www.geeksforgeeks.org/java-program-for-iterative-merge-sort/
    private void executeMergeSort(Person[] people) {
        System.out.println("Calling Merge Sort" + counter++);
        if (people == null) {
            return;
        }
        if (people.length > 1) {
            int middlePosition = people.length / 2;
            // Split left part
            Person[] left = new Person[middlePosition];
            for (int i = 0; i < middlePosition; i++) {
                left[i] = people[i];
            }
            // Split right part
            Person[] right = new Person[people.length - middlePosition];
            for (int i = middlePosition; i < people.length; i++) {
                right[i - middlePosition] = people[i];
            }
            executeMergeSort(left);
            executeMergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays
            while (i < left.length && j < right.length) {
                if (Long.valueOf(left[i].getPhone()) < Long.valueOf(right[j].getPhone())) {
                    people[k] = left[i];
                    i++;
                } else {
                    people[k] = right[j];
                    j++;
                }
                k++;
            }
            // Collect remaining elements
            while (i < left.length) {
                people[k] = left[i];
                i++;
                k++;
            }
            while (j < right.length) {
                people[k] = right[j];
                j++;
                k++;
            }
        }
        peopleList = Arrays.asList(people);
    }

    public Person[] getPeople() {
        return peopleList.toArray(new Person[peopleList.size()]);
    }

    public void executeHeapSort() {
        //https://www.geeksforgeeks.org/heap-sort/
        executeHeapSort(getPeople());
    }

    public void executeHeapSort(Person[] people) {
        int n = people.length;

        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(people, n, i);

        // One by one extract an element from heap
        for (int i = n - 1; i >= 0; i--) {
            // Move current root to end
            Person temp = people[0];
            people[0] = people[i];
            people[i] = temp;

            // call max heapify on the reduced heap
            heapify(people, i, 0);
        }
        peopleList = Arrays.asList(people);
    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(Person people[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2*i + 1; // left = 2*i + 1
        int r = 2*i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < n && Long.valueOf(people[l].getPhone()) > Long.valueOf(people[largest].getPhone()))
            largest = l;

        // If right child is larger than largest so far
        if (r < n && Long.valueOf(people[r].getPhone()) > Long.valueOf(people[largest].getPhone()))
            largest = r;

        // If largest is not root
        if (largest != i)
        {
            Person swap = people[i];
            people[i] = people[largest];
            people[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(people, n, largest);
        }
    }

}
