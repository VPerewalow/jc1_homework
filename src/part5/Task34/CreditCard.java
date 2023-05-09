package part5.Task34;

public class CreditCard extends Card {
    String typeCard;

    public CreditCard(String nameBank, String typeCard) {
        super(nameBank, typeCard);
        this.typeCard = typeCard;
    }
    public void showCard() {
        System.out.println("Тип вашей карты - " + typeCard);
    }

}
