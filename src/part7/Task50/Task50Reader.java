package part7.Task50;
import java.io.*;

public class Task50Reader {
    public static void main(String[] args) throws IOException {
        DataInputStream reader = null;
        try {
            reader = new DataInputStream(new BufferedInputStream(new FileInputStream("document.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("FILE NOT FOUND");
            return;
        }
        int res = reader.readInt();
        while (true) {
            System.out.println(res);
            try {
                res = reader.readInt();
            } catch (EOFException e) {
                break;
            }
        }
        if (reader != null) {
            reader.close();
        }
    }
}
