package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class MovingFile {
    public static void MoveFileToDirectory_RenameMethod(String path, String pathFolder) {

        try {
            File afile = new File(path);

            if (afile.renameTo(new File(pathFolder + afile.getName()))) {
                System.out.println("File was moved");
            } else {
                System.out.println("Moving file failed !!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
