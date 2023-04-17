package part3;

public class Task26 {
    public static void main(String[] args) {
        class ATM {
            private int twentyCount;
            private int fiftyCount;
            private int hundredCount;

            public ATM(int twentyCount, int fiftyCount, int hundredCount) {
                this.twentyCount = twentyCount;
                this.fiftyCount = fiftyCount;
                this.hundredCount = hundredCount;
            }

            public void addMoney(int twenties, int fifties, int hundreds) {
                twentyCount += twenties;
                fiftyCount += fifties;
                hundredCount += hundreds;
            }

            public boolean withdrawMoney(int amount) {
                if (amount % 10 != 0) {
                    System.out.println("Сумма должна быть кратна 10");
                    return false;
                }

                int hundredsNeeded = amount / 100;

                if (hundredsNeeded > hundredCount) {
                    System.out.println("В банкомате не хватает купюр номиналом 100");
                    return false;
                }

                amount -= hundredsNeeded * 100;

                int fiftiesNeeded = amount / 50;

                if (fiftiesNeeded > fiftyCount) {
                    System.out.println("В банкомате не хватает купюр номиналом 50");
                    return false;
                }

                amount -= fiftiesNeeded * 50;

                int twentiesNeeded = amount / 20;

                if (twentiesNeeded > twentyCount) {
                    System.out.println("В банкомате не хватает купюр номиналом 20");
                    return false;
                }

                amount -= twentiesNeeded * 20;

                if (amount != 0) {
                    System.out.println("Не удалось выдать запрашиваемую сумму");
                    return false;
                }

                hundredCount -= hundredsNeeded;
                fiftyCount -= fiftiesNeeded;
                twentyCount -= twentiesNeeded;

                System.out.println("Выдано " + hundredsNeeded + " номиналом 100, " + fiftiesNeeded + " номиналом 50, и " + twentiesNeeded + " номинало 20");

                return true;
            }
        }
    }
}
