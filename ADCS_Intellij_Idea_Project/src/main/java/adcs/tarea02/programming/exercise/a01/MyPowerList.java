package main.java.adcs.tarea02.programming.exercise.a01;

import main.java.adcs.tarea02.programming.exercise.f06.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyPowerList<T> extends ArrayList {

    public MyPowerList(){
        super();
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    public int[] mySortMethod(int []items) {
        for (int i = 0; i < items.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < items.length; j++)
                if (items[j] < items[min_idx])
                    min_idx = j;

            int temp = items[min_idx];
            items[min_idx] = items[i];
            items[i] = temp;
        }
        return items;
    }

    public List leftMerge(MyPowerList leftList) {
        List clonedLeftList = (List)leftList.clone();
        clonedLeftList.addAll(this);
        return clonedLeftList;
    }

    public List rightMerge(MyPowerList rightList) {
        List temp = this;
        temp.addAll(rightList);
        return temp;
    }

    public void saveToFile(){
        try {
            Files.write(Paths.get("C:\\temp\\output.txt"), this.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveToFile(String fileName){
        try {
            Iterator<Person> it = this.iterator();
            StringBuilder sb = new StringBuilder();
            while(it.hasNext()){
                Person record = it.next();
                sb.append(record).append("\n");
            }
            Files.write(Paths.get(fileName), sb.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String[]> readFromFile(String fileName) throws IOException {
        List<String[]> result = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            String data = line.replace("]","").replace("\"","");
            String []information = data.split(",");
            result.add(information);
        }
        bufferedReader.close();
        return result;
    }

    public List<Person> readPeopleFromFile(String fileName) throws IOException {
        List<Person> result = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line;
        while((line = bufferedReader.readLine()) != null) {
            String data = line
                    .replace("name","").replace("address","")
                    .replace("phone","").replace("email","")
                    .replace("=","").replace("[","")
                    .replace("]","").replace("\"","");
            String []information = data.split(",");
            result.add(new Person(removeBlankSpaces(information[0]), removeBlankSpaces(information[1]), removeBlankSpaces(information[2]), removeBlankSpaces(information[3]) ));
        }
        bufferedReader.close();
        return result;
    }
    private String removeBlankSpaces(String element){
        return element.trim();
    }

    public List findByName(String nameToSearch) {
        List<Person> result = new ArrayList<>();
        Iterator<Person> it = iterator();
        while (it.hasNext() ){
            Person person = it.next();
            String name = person.getName();
            String address = person.getAddress();
            String phone = person.getPhone();
            String email = person.getEmail();
            if(name.toUpperCase().contains(nameToSearch.toUpperCase())){
                result.add(new Person(name, address, phone, email));
            }
        }
        return result;
    }
}
