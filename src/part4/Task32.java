package part4;

public class Task32 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 1000000; i++) {
            s += "aaabbbccc";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: "+ (endTime - startTime) +" ms");

        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("aaabbbccc");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Время выполнения: "+ (endTime - startTime) +" ms");
    }
}

