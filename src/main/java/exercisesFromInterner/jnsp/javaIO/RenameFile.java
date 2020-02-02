package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class RenameFile {
    public static void RenameFile(String oldPath, String newPath){
        File oldFile = new File(oldPath);
        File newFile = new File(newPath);

        if (oldFile.renameTo(newFile)){
            System.out.println(oldFile.getName() + " was successfully renamed to : " + newFile.getName());
        }else{
            System.out.println("Name change failed !!! ");
        }
    }
}
