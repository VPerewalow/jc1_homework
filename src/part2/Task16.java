package part2;

public class Task16 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 50; i <= 70; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                if (count == 2) {
                    System.out.println("Второе простое число: " + i);
                    break;
                }
            }
        }
    }
}
