package exercisesFromInterner.jnsp.javaIO;

import java.io.File;

public class FileSize {
    public static void CheckSize(String path) {
        File file = new File(path);
        if (file.exists()) {
            double bytes = file.length();
            double kilobytes = (bytes / 1024);
            double megabytes = (kilobytes / 1024);
            double gigabytes = (megabytes / 1024);

            System.out.println("bytes : " + bytes);
            System.out.println("kilobytes : " + kilobytes);
            System.out.println("megabytes : " + megabytes);
            System.out.println("gigabytes : " + gigabytes);
        }else{
            System.out.println("File does not exist !!!");
        }

    }
}
