package part2;

import java.time.LocalDate;

public class Task10 {
    public static void main(String[] args) {
        int year = 2023;
        int month = 4;
        int day = 23;
        LocalDate date = LocalDate.of(year, month, day + 1);
        System.out.println(date);
    }
}
