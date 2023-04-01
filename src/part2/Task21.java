package part2;

public class Task21 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 2, 13, 85, 12, 31};
        int max = array[0];
        int maxIndex[] = new int[array.length];
        int maxCount = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxCount = 0;
                maxIndex[maxCount++] = i;
            } else if (array[i] == max) {
                maxIndex[maxCount++] = i;
            }
        }
        System.out.println("Максимальное значение массива: " + max);
        for (int i = 0; i < maxCount; i++) {
            System.out.println("Индекс максимального значения массива: " + maxIndex[i]);
        }
    }
}

