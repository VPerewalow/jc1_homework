package part6;

import java.util.ArrayList;
import java.util.Random;

public class Task40 {
    public static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            grades.add(random.nextInt(10) + 1);
        }
        System.out.println("List of student grades: " + grades);
        grades.removeIf(grade -> grade < 5);
        System.out.println("List of student grades without unsatisfactory grades: " + grades);
    }
}

