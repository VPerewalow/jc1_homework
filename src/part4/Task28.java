package part4;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String str = scanner.nextLine();
        String[] words = str.trim().split("\\s+");
        int count = words.length;
        System.out.println("Количество слов в предложении: " + count);
    }
}
