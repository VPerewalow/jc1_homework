package part4;

public class Task28 {
    public static void main(String[] args) {
        String str = "  введите с клавиатуры текст. подсчитать количество слов в тексте. ";
        String[] words = str.trim().split("\\s+");
        int count = words.length;
        System.out.println("Количество слов в предложении: " + count);
    }
}
