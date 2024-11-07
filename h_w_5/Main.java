import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String testDir = "c:\\temp\\test_backup";
        String testFile = "tic_tac_toe.txt";
    
        try {
            BackupDir backuper = new BackupDir(testDir);
            backuper.makeBackupDirWithoutSubDir(); // занимается созданием резервной копии файлов без поддиректорий.
            //backuper.makeBackupDirWithSubDir();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        
        byte[] array = new byte[]{1, 0, 2
                , 0, 0, 0
                , 1, 3, 2};

        try{
            TicTacToeByteWriter tTTWriter = new TicTacToeByteWriter(testFile);
            tTTWriter.writeTicTacToeToFileThreeByte(array);
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }


    }


}