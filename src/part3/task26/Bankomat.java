package part3.task26;

import java.util.Scanner;

public class Bankomat {
    private int count20;
    private int count50;
    private int count100;

    public Bankomat(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }

    public boolean addMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество купюр номиналом 20: ");
        int add20 = scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 50: ");
        int add50 = scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 100: ");
        int add100 = scanner.nextInt();
        if (add20 < 0 || add50 < 0 || add100 < 0) {
            System.out.println("Ошибка! Количество купюр не может быть отрицательным.");
            return false;
        }
        this.count20 += add20;
        this.count50 += add50;
        this.count100 += add100;
        System.out.println("Операция выполнена успешно.");
        return true;
    }

    public boolean withdrawMoney() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия: ");
        int sum = scanner.nextInt();
        if (sum < 0) {
            System.out.println("Ошибка! Сумма не может быть отрицательной.");
            return false;
        }
        if (sum % 10 != 0) {
            System.out.println("Ошибка! Сумма должна быть кратна 10.");
            return false;
        }
        int count20Needed = sum / 20;
        int count50Needed = sum / 50 - count20Needed * 2;
        int count100Needed = sum / 100 - count20Needed * 5 - count50Needed * 2;
        if (count20Needed > this.count20 || count50Needed > this.count50 || count100Needed > this.count100) {
            System.out.println("Ошибка! Недостаточно денег в банкомате.");
            return false;
        }
        this.count20 -= count20Needed;
        this.count50 -= count50Needed;
        this.count100 -= count100Needed;
        System.out.printf("Выдано %d купюр номиналом 20, %d купюр номиналом 50 и %d купюр номиналом 100.%n", count20Needed, count50Needed, count100Needed);
        return true;
    }
}
