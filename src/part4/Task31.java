package part4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("<p(\\s+[^>]*)?>");
        Matcher matcher = pattern.matcher(text);
        String result = matcher.replaceAll("<p>");
        System.out.println(result);
    }
}

