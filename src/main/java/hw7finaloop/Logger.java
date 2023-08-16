package hw7finaloop;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class Logger {
    private static FileWriter logFile;


    public Logger() {
        try{
            logFile = new FileWriter("D:\\GB Обучение\\JAVA\\ООП\\HwOOP\\src\\main\\java\\hw7finaloop\\configlog.txt");
        } catch (IOException e) {
            System.out.println("Message" + e.getMessage());

        }
    }

    public void info(String message) {
        try{
            logFile.write(new Timestamp(System.currentTimeMillis())+ " " + message + "\n");
            logFile.flush();

        } catch (IOException e) {
            System.out.println("Message" + e.getMessage());
        }

    }
}
