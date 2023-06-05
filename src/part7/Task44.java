package part7;

public class Task44 {
    public static void main(String[] args) {
        String str = null;
        int length = 0;

        try {
            length = str.length();

        } catch (NullPointerException e) {
            length = 0;
            System.out.println("Length cannot be null!!!");
            System.exit(1);
        } finally {
            System.out.println("Length string is " + length);
            System.exit(0);
        }
    }
}

