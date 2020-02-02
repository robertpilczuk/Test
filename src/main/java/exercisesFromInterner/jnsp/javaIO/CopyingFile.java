package exercisesFromInterner.jnsp.javaIO;

import java.io.*;

public class CopyingFile {
    public static void CopyFile(String path1, String path2) {
        InputStream inStream = null;
        OutputStream outStream = null;

        try {
            File afile = new File(path1);
            File bfile = new File(path2);

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];
            int length;

            while ((length = inStream.read(buffer)) > 0) {
                outStream.write(buffer, 0, length);
            }
            inStream.close();
            outStream.close();

            System.out.println("File was copied successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
