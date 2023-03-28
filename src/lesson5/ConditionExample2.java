package lesson5;

public class ConditionExample2 {
    public static void main(String[] args) {
        int x = 5, y = 7;
        if (x == 5) {
            y = 9;
        } if (y == 9) {
            x = 3;
        }
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
