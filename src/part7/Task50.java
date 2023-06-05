package part7;
import java.io.*;
import java.util.Random;


public class Task50 {
    public static void main(String[] args) throws IOException {
        DataOutputStream myFail;
        try {
            myFail = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("document.dat")));
            int[] array = new int[20];
            Random random = new Random();
            for (int i = 0; i < array.length; ++i) array[i] = random.nextInt();

            for (int i = 0; i < array.length; ++i) System.out.println(array[i]);

            for (int j : array) myFail.write(String.valueOf(j).getBytes());

            try (FileReader reader = new FileReader("document.dat")) {
                reader.read();
            }
            int average = 0;
            for (int i = 0; i < array.length; ++i) {
                average += array[i];
                average /= 20;
            }
            System.out.println("Среднеарифметическое равно - " + average);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
