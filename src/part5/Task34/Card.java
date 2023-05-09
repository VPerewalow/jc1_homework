package part5.Task34;

public class Card {
    String nameBank;

    public Card(String nameBank, String typeCard) {
        this.nameBank = nameBank;
    }

    public String getNameBank() {
        return nameBank;
    }
    public void chooseBank() {
        System.out.println("Ваш банк " + nameBank);
    }

}

