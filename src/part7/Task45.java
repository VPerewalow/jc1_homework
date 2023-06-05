package part7;
import java.util.Scanner;

public class Task45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int x = scanner.nextInt();
        if (x < 60) {
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("NO pension for your age");
                System.exit(1);
            }
        }
        System.out.println("Your age is right. You have a pension");
    }
}
