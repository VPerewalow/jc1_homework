package part5.Task34;

public class DebitCard extends Card {
    int time;

    public DebitCard(String nameBank, String typeCard, int time) {
        super(nameBank, typeCard);
        this.time = time;
    }
    public void doneCard () {
        System.out.println("Ваша карта будет готова через " + time + " часов");
    }
}

