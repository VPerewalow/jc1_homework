package part2;

public class Task24 {
    public static void main(String[] args) {
        int[][] mass = new int[5][5];
        mass[2][2] = 1;
        for (int i = 0; i < 5; i++) {
            mass[i][0] = 1;
        }
        for (int i = 1; i < 4; i++) {
            mass[i][1] = 1;
        }
        for (int i = 1; i < 4; i++) {
            mass[i][3] = 1;
        }
        for (int i = 0; i < 5; i++) {
            mass[i][4] = 1;
        }
        for (int j = 0; j < mass[0].length; j++) {
            for (int i = 0; i < mass.length; i++) {
                System.out.print(mass[i][j]);
            }
            System.out.println();
        }
    }
}