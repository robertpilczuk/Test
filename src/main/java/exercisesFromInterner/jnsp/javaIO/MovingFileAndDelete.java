package exercisesFromInterner.jnsp.javaIO;

import java.io.*;

public class MovingFileAndDelete {
    public static void MoveFileToDirectory_CopyDelete(String pathFile, String pathFile2) {
        InputStream inStream = null;
        OutputStream outStream = null;
        try {
            File afile = new File(pathFile);
            File bfile = new File(pathFile2);

            inStream = new FileInputStream(afile);
            outStream = new FileOutputStream(bfile);

            byte[] buffer = new byte[1024];
            int length;
            while ((length = inStream.read(buffer)) > 0){
                outStream.write(buffer,0,length);
            }
            inStream.close();
            outStream.close();

            afile.delete();
            System.out.println("");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
