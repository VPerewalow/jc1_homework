package wh;

public class part6 {
    public static void main(String[] args) {
        int s = 356245632;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int d = h / 24;
        int w = d / 7;
        System.out.println(h + " часов " + min + " минут " + sec + " секунд " + d + " дней " + w + " недель ");
    }
}
