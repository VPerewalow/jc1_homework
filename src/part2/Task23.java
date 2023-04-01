package part2;

import java.util.Collections;

public class Task23 {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 9, 11, 2, 13, 85, 12, 31};
        System.out.println("Массив перед реверсом:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("\nМассив после реверса:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}