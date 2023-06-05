package part6;
import java.util.*;

public class Task43 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String name = in.nextLine();

        Map<String, Integer> myText = new HashMap<>();
        List<String> text = new ArrayList<>();
        text.add(name);
        String[] words = name.split("[^a-zA-Zа-яА-Я]+");

        for (String word : words) {
            Integer repeat = myText.get(word);
            if (repeat == null)
                myText.put(word, 1);
            else {
                myText.put(word, repeat + 1);
            }
        }
        System.out.println(myText);
    }
}
