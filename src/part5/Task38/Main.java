package part5.Task38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер сезона (1-4): ");
        int seasonNumber = scanner.nextInt();
        Season season = Season.values()[seasonNumber - 1];
        System.out.printf("Количество дней в %s - %d%n", season.getDescription(), season.getCountOfDays());
    }
}
