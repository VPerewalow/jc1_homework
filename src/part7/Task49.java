package part7;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class Task49 {
    public static void main(String[] args) throws IOException {
        File myText = new File("E:\\repo\\MyText2.txt");
        try (FileReader fr = new FileReader(myText)) {
            int text;
            System.out.println("Текст из файла:");
            while ((text = fr.read()) != -1) {
                System.out.print((char) text);
            }
            FileInputStream fis = new FileInputStream(myText);
            byte[] array = new byte[(int) myText.length()];
            fis.read(array);
            String str = new String(array);
            Pattern pattern = Pattern.compile("[0-9]");
            Matcher matcher = pattern.matcher(str);
            System.out.print("\nВсе цифры в тексте: ");
            int total = 0;
            while (matcher.find()) {
                System.out.print(matcher.group());

                total += Integer.parseInt(matcher.group());
            }
            System.out.println("\nСумма всех чисел: " + total);


        }
    }
}