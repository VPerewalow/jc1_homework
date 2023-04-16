package part4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task27 {
    public static void main(String[] args) {
        String str = "введите с клавиатуры строку. найти в стоке не только запятые, но и другие знаки препинания.";
        Pattern pattern = Pattern.compile("\\p{Punct}");
        Matcher matcher = pattern.matcher(str);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Количество знаков препинания в строке: " + count);
    }
}
