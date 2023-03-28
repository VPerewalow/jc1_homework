package part2;

public class Task13 {
    public static void main(String[] args) {
        int xLow = 0;
        int xHigh = 10;
        int value = 1;
        while (xLow <= xHigh) {
            if (xLow == 0)
                value = value * (xLow + 1);
            else
                value = value * xLow;
            xLow++;
            System.out.println("Факториал для " + (xLow - 1) + " = " + value);
        }
    }
}
