package adcs.tarea01.programming.exercise.i09;

import java.util.TreeMap;

public class ProgrammingExercise09 {

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    //Numbers lower than 3999
    public static void main(String[] args) throws Exception {
        for (int i = 1; i<= 3999; i++) {
            System.out.println(i+"\t =\t "+ toRoman ( i ) );
        }
    }

    public final static String toRoman(int number) throws Exception {
        if(number<0){
            throw new Exception("number less than zero");
        }
        int l =  map.floorKey(number);
        if ( number == l ) {
            return map.get(number);
        }
        return map.get(l) + toRoman(number-l);
    }

}
