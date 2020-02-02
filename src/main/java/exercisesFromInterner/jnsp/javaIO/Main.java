package exercisesFromInterner.jnsp.javaIO;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        String testFile = "c:\\JavaIOTest\\test.txt";
        String testFile2 = "c:\\JavaIOTest\\1.png";
        String testFileNew = "c:\\JavaIOTest\\testNew.txt";
        String testFileNew2 = "c:\\JavaIOTest\\testNew2.txt";



        CreatingFolder.CreateFolder("c:\\JavaIOTest\\");
        CreatingFolder.CreateFolder("c:\\JavaIOTest\\folder_A\\");
        CreatingFolder.CreateFolder("c:\\JavaIOTest\\folder_B\\");
        CreatingFolder.CreateFolder("c:\\JavaIOTest\\folder_C\\");
        CreatingFile.CreateFile(testFile);
        CreatingFile.CreateFile("c:\\JavaIOTest\\folder_A\\test_Afile.txt");
        CreatingFile.CreateFile("c:\\JavaIOTest\\folder_B\\test_Bfile.txt");
        TestingIfExist.CheckIfFileExist(testFile);
        FileSize.CheckSize(testFile2);
        DeletingFile.DeleteFile(testFile);
        RenameFile.RenameFile(testFileNew,testFileNew2);

        CopyingFile.CopyFile("c:\\JavaIOTest\\folder_A\\test_Afile.txt","c:\\JavaIOTest\\folder_B\\test_Bfile.txt");
        MovingFile.MoveFileToDirectory_RenameMethod(testFile,"c:\\JavaIOTest\\folder_C\\");
        MovingFileAndDelete.MoveFileToDirectory_CopyDelete("c:\\JavaIOTest\\folder_A\\test_Afile.txt",
                "c:\\JavaIOTest\\folder_C\\test_Afile.txt");
    
    }

}
