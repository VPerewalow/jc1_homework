package part7.Task46;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AgeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int x = scanner.nextInt();
        try {
            Age.retirementAge(x);
        } catch (AgeException e) {
            e.printStackTrace();
            System.out.println("NO pension for your age" );
            System.exit(1);
        } finally {
            System.out.println("Your age is right. You have a pension");
            System.exit(0);
        }
    }
}
