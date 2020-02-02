package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class DeletingFile {

    public static void DeleteFile(String path){
        File file = new File(path);
           if (file.delete()) {
               System.out.println(file.getName() + " was deleted");
           } else {
               System.out.println("Delete operation failed !!! ");
           }
    }
}
