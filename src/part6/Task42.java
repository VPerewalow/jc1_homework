package part6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task42 {
    public static void main(String[] args) {
        int value = 10;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            int mark = 1 + (int) (Math.random() * 10);
            list.add(mark);
        }
        System.out.println("The marks of class: " + list);


        Iterator<Integer> list2 = list.iterator();
        int max = list2.next();
        while (list2.hasNext()) {
            Integer result = list2.next();
            if (result > max)
                max = result;
        }
        System.out.println("The highest mark: " + max);
    }
}
