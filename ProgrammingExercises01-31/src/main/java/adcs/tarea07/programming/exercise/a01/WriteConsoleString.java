package adcs.tarea07.programming.exercise.a01;

public class WriteConsoleString implements WriteStrategy {

    @Override
    public Object execute(Object object) {
        if(object instanceof Object[]){
            Object []lines = (Object [])object;
            for(Object line : lines){
                System.out.println(line);
            }
        }
        return true;
    }

}
