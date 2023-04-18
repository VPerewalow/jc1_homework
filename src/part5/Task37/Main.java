package part5.Task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер сезона (1-4): ");
        int seasonNumber = scanner.nextInt();
        Season season = Season.values()[seasonNumber - 1];
        System.out.printf("Следующий сезон после %s - %s%n", season.getDescription(), season.getNextSeason().getDescription());
    }
}
