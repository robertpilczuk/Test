package exercisesFromInterner.jnsp.guessingTheNumber;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Handler handler = new Handler();
        handler.inputScanner();
        handler.checker();
    }
}
