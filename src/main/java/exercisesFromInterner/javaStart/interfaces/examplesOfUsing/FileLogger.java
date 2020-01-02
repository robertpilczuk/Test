package exercisesFromInterner.javaStart.interfaces.examplesOfUsing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void log(String text) {
        try {
            File file = new File("logs.txt");
            FileWriter writer = new FileWriter(file);
            writer.write(text + "\n");
            writer.close();
        } catch (IOException e) {
            //ignore
        }
    }

    @Override
    public void error(String text) {

    }
}
