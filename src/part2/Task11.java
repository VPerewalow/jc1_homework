package part2;

public class Task11 {
    public static void main(String[] args) {

        int e = 7, f = 9, a = 3, b = 3, c = 5, d = 2;
        if ((e >= (a + c)) && (f >= b && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            System.out.println("Можно построить 2 дома");
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            System.out.println("Можно построить 2 дома");
        } else
            System.out.println("Нельзя построить 2 дома");
    }
}
