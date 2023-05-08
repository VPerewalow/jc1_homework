package part2;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        String numberString = Integer.toString(random.nextInt());
        int length = numberString.length();
        StringBuilder builder = new StringBuilder(numberString);
        for (int i = length - 3; i > 0; i -= 3) {
            builder.insert(i, ' ');
        }
        String formattedNumber = builder.toString();
        System.out.println(formattedNumber);
    }
}

