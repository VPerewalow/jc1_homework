package part3.task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bankomat bankomat = new Bankomat(30, 30, 30);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1 - добавить деньги");
            System.out.println("2 - снять деньги");
            int operation = scanner.nextInt();
            boolean result;
            switch (operation) {
                case 1:
                    result = bankomat.addMoney();
                    break;
                case 2:
                    result = bankomat.withdrawMoney();
                    break;
                default:
                    System.out.println("Ошибка! Неверная операция.");
                    continue;
            }
            if (result) {
                System.out.println("Операция выполнена успешно.");
            } else {
                System.out.println("Операция не удалась.");
            }

        }
    }
}
