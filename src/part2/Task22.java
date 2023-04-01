package part2;

public class Task22 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 2, 13, 85, 12, 31};
        int sum = 0;
        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= array[indexOfMax])
                indexOfMax = i;
            else if (array[i] < array[indexOfMin])
                indexOfMin = i;
        }
        for (int m = Math.min(indexOfMax, indexOfMin) + 1; m < Math.max(indexOfMax, indexOfMin); m++) {
            sum += array[m];
        }
        System.out.println(sum);
    }
}

