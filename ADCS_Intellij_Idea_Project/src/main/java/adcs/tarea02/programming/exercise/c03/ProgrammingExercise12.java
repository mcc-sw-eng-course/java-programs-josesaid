package main.java.adcs.tarea02.programming.exercise.c03;
import main.java.adcs.tarea02.programming.exercise.a01.MyPowerList;
import java.util.List;
public class ProgrammingExercise12 {
    public static void main(String[] args) {
        MyPowerList list = new MyPowerList();
        list.add("100");
        list.add("101");
        list.add("102");

        MyPowerList preffixList = new MyPowerList();
        preffixList.add("A");
        preffixList.add("B");
        preffixList.add("C");
        preffixList.add("D");

        MyPowerList suffixList = new MyPowerList();
        suffixList.add("♫");
        suffixList.add("@");
        suffixList.add("♪");
        suffixList.add("►");
        suffixList.add("‼");
        suffixList.add("¶");

        List result01 = list.leftMerge(preffixList);
        System.out.println(result01);

        List result02 = list.rightMerge(suffixList);
        System.out.println(result02);
    }

}
