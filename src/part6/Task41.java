package part6;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task41 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int mark = (int) (Math.random() * 10);
            list.add(mark);
        }
        System.out.println("The collection of random numbers: " + list);

        Set<Integer> set = new LinkedHashSet<> (list);
        List<Integer> listNew = new ArrayList<>(set);
        System.out.println("New collection: " + listNew);
    }
}
