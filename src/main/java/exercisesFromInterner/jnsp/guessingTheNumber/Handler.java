package exercisesFromInterner.jnsp.guessingTheNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Handler {
    int input;
    int random = new Random().nextInt(100);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void inputScanner() throws IOException {
        System.out.println("Enter num: ");

        tryCatch();
        checker();
    }

    public void tryCatch() throws IOException {
        boolean goodInput = false;
        while(!goodInput) {
            try {
                input = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
            goodInput = true;
        }
    }

    public void checker() throws IOException {
        while (input != random) {
            if (input > random){
                System.out.println("too big, try again");
            }
            if (input < random){
                System.out.println("too small, try again");
            }
            tryCatch();

            if (input == random){
                System.out.println("congratulation !");
            }
        }
    }
}
