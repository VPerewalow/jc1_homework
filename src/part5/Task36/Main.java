package part5.Task36;

public class Main {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.printf("%s - %s (%d дней)%n", season.name(), season.getDescription(), season.getCountOfDays());
        }
    }
}

