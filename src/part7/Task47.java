package part7;
import java.io.File;

public class Task47 {
    public static void main(String[] args) {
        File myCatalog = new File("E:\\repo");
        if (myCatalog.isDirectory()) {
            for (File num : myCatalog.listFiles()) {
                if (num.isDirectory()) System.out.println("Folders :  " + num.getName());
            }
            for (File num : myCatalog.listFiles()) {
                if (!num.isDirectory()) System.out.println("Files : " + num.getName());

            }
        }
    }
}