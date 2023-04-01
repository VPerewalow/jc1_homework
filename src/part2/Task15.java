package part2;

public class Task15 {
    public static void main(String[] args) {
        long num = 7893823445L;
        int sum = 0;
        do {
            long digit = num % 10;
            sum += digit;
            num /= 10;
        } while (num > 0);
        System.out.println("Сумма цифр: " + sum);
    }
}


