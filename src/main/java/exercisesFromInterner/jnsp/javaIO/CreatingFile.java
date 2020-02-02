package exercisesFromInterner.jnsp.javaIO;

import java.io.File;
import java.io.IOException;

public class CreatingFile {

    public static void CreateFile(String path){
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully");
            } else {
                System.out.println("File already exist !!!");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
