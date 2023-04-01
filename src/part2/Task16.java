package part2;

public class Task16 {
    public static void main(String[] args) {
        boolean y = true;
        for (int num = 50; num <= 70; num++) {
            y = true;
            if (num == 1) y = false;
            for (int divisor = 2; divisor < num && y; divisor++) {
                if (num % divisor == 0) {
                    y = false;
                }
            }
            if (y) System.out.println("Простое число: " + num);
        }
    }
}
