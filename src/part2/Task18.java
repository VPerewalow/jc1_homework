package part2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;
import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
        }
        System.out.println(String.valueOf(random.nextInt()).replaceAll("(?=(\\d{3})+$)", " "));
    }
}

