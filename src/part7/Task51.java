package part7;


import java.io.*;
import java.util.Objects;
import java.util.Random;

public class Task51 {
    public static void main(String[] args) throws IOException {

        File directory = new File("E:\\repo\\1\\2\\3");
        directory.mkdirs();

        for (int i = 1; i <= 5; i++) {
            File doc = new File(directory, "Doc_" + i + ".txt");
            doc.createNewFile();

            try (OutputStream os = new FileOutputStream(doc)) {
                Random random = new Random();
                int[] array = new int[20];
                for (int j = 0; j < array.length; ++j) array[j] = random.nextInt();
                for (int j : array) os.write(String.valueOf(j).getBytes());
            }

            try (FileOutputStream allFiles = new FileOutputStream("E:\\repo\\1\\2\\3\\allFiles.txt", true)) {
                try (FileInputStream reader = new FileInputStream(doc)) {
                    allFiles.write(reader.readAllBytes());
                }
                try (FileOutputStream listOfFiles = new FileOutputStream("E:\\repo\\1\\2\\3\\ListOfFiles.txt")) {
                    File myCatalog = new File("E:\\repo\\1\\2\\3");
                    if (myCatalog.isDirectory()) {
                        for (File num : Objects.requireNonNull(myCatalog.listFiles()))
                            listOfFiles.write(num.getName().getBytes());
                    }
                }
            }
        }
    }
}

