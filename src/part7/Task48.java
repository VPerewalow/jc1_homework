package part7;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task48 {
    public static void main(String[] args) throws IOException {
        File myText = new File("E:\\repo\\MyText.txt");
        try (FileReader fr = new FileReader(myText)) {
            int text;
            System.out.println("Текст из файла :");
            while ((text = fr.read()) != -1) {
                System.out.print((char) text);
            }
            int count = 0;
            FileInputStream fis = new FileInputStream(myText);
            byte[] array = new byte[(int) myText.length()];
            fis.read(array);
            String str = new String(array);
            String[] data = str.split(" ");
            for (int i = 0; i < data.length; i++) count++;

            System.out.println("\nКоличество слов: " + count);

            Pattern pattern = Pattern.compile("[\\p{P}]");
            Matcher matcher = pattern.matcher(str);
            int count2 = 0;
            while (matcher.find()) ++count2;

            System.out.println("Количество знаков препинания: " + count2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
