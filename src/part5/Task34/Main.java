package part5.Task34;

public class Main {
    public static void main(String[] args) {
        Card bank1 = new Card("Sberbank", "дебетовая");
        Card bank2 = new Card("MTBank", "кредитовая");

        CreditCard debit = new CreditCard("Sberbank", "дебетовая");
        CreditCard credit = new CreditCard("MTBank", "кредитовая");

        DebitCard express = new DebitCard("Sberbank", "international", 5);
        DebitCard classic = new DebitCard("Sberbank", "international", 48);

        bank1.chooseBank();

        debit.showCard();

        express.doneCard();

    }
}

