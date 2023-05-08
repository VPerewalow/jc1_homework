package part2;

public class Task11 {
    public static void main(String[] args) {

            int a = 2, b = 3, c = 4, d = 5, e = 6, f = 7;

            if (a < 0 || b < 0 || c < 0 || d < 0 || e < 0 || f < 0) {
                System.out.println("Ошибка: введено отрицательное значение.");
            } else {
                int house1 = a * b;
                int house2 = c * d;
                int plot = e * f;

                if ((house1 + house2) <= plot) {
                    System.out.println("Два дома помещаются на участке.");
                } else {
                    System.out.println("Два дома не помещаются на участке.");
                }
            }
        }
    }
