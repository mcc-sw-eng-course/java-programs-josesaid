package main.java.adcs.tarea01.programming.exercise.a01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgrammingExercise01 {

    public static void main(String[] args) {
        method01();
        method02();
    }

    private static void method01() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        try {
            String stringNumber = br.readLine();
            int intNumber = Integer.parseInt(stringNumber);
            if(intNumber % 2 == 0){
                if(intNumber % 4 == 0){
                    System.out.println("The number is divisible by four(4)");
                }else {
                    System.out.println(" Even number");
                }
            }else{
                System.out.println("Odd number");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void method02() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a number 01/02: ");
            String stringNumber01 = br.readLine();
            int num = Integer.parseInt(stringNumber01);
            System.out.print("Enter a number 02/02: ");
            String stringNumber02 = br.readLine();
            int check = Integer.parseInt(stringNumber02);
            int result = check / num ;
            if( result == 1){
                System.out.println("Second number divided by the first one is equals than 1");
            }else{
                if(result>1){
                    System.out.println("result: " + result);
                }else{
                    System.out.println("Negative result: " + result);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
