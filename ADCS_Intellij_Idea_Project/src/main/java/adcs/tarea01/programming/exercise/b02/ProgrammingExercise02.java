package main.java.adcs.tarea01.programming.exercise.b02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class ProgrammingExercise02 {
    public static void main(String[] args) {
        int randomNumber = generateRandomNumber();
        System.out.println("Guess the number generated: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = 0;
        try {
            String input = br.readLine().trim();
            boolean found = false;
            while( !input.equalsIgnoreCase("exit") && !found){
                times++;
                try{
                    int userNumber = Integer.parseInt(input);
                    String message = evaluateNumbers(randomNumber, userNumber);
                    if(message.indexOf("you guessed") >= 0){
                        found = true;
                    }
                    System.out.println(message);
                    if(!found){
                        System.out.println("Guess one more time the number generated: ");
                        input= br.readLine().trim();
                    }
                }catch(NumberFormatException e){
                    System.out.println("expceion: " + e.getMessage());
                }
            }
            System.out.println("The user played: " + times +" times");
        } catch (IOException e) {
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static int generateRandomNumber() {
        return new Random().nextInt(9)+1;
    }

    private static String evaluateNumbers(int randomNumber, int userNumber) {
        String message = null;
        if(randomNumber == userNumber){
            message = "you guessed the number generated randomly: " + randomNumber;
        }else
        if(userNumber < randomNumber){
            message = "Too low";
        }else {
            message="Too high";
            }
        return message;
    }

}
