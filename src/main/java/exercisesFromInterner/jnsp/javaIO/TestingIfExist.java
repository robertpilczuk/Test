package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class TestingIfExist {
    public static boolean CheckIfFileExist(String path){
        File file = new File(path);
        if (file.exists()){
            System.out.println("File exist");
            return true;
        }else{
            System.out.println("File does not exist !!! ");
            return false;
        }
    }
}
