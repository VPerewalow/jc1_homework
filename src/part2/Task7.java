package part2;


public class Task7 {
    public static void main(String[] args) {
        System.out.println(getBoolean());
    }

    private static boolean getBoolean() {
        int number = -235627;
        if (number % 10 == 7 || number % 10 == -7) {
            return true;
        } else {
            return false;
        }
    }
}
