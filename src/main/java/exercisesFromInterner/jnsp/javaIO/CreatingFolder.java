package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class CreatingFolder {
    public static void CreateFolder(String path){
        boolean success = (new File(path).mkdirs());
        if (!success){
            System.out.println("Folder does not created because it already exist! ");
        }else{
            System.out.println("Folder created successfully !!! ");
        }
    }
}
