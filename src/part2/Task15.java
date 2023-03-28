package part2;

public class Task15 {
    public static void main(String[] args) {
        long i = 7893823445;
        long sum = 0;
        do {
            System.out.println(sum + (i % 10));
        } while(i <= 25);
    }
}
