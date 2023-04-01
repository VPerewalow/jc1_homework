package part2;

public class Task20 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 2, 13, 85, 12, 31};
        for (int i = 2; i < array.length; i = i + 2) {
            System.out.print(array[i] + " ");
        }
    }
}


