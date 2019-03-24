package adcs.tarea02.programming.exercise.a01;

public class ProgrammingExercise10 {

    public static void main(String[] args) {
        MyPowerList list = new MyPowerList();
        list.add("Jose");
        list.add("Juan");
        list.add("Julio");
        list.add("Jaime");
        System.out.println("List values: "  + list);
        list.remove(2); //removing Julio
        System.out.println("List values: "  + list);
    }

}
