package part5.Task33;

public class Main {
    public static void main(String[] args) {

        Machine one = new Machine("Kettle");
        Machine one2 = new Machine("Oven");
        KitMachine two = new KitMachine("Fridge", "Samsung");
        KitMachine two2 = new KitMachine("Dishwasher", "Zanussi");
        ColorMachine three = new ColorMachine("Coffee machine", "BOSCH", "beige", 150);

        one.display();
        two.brandName();
        two2.display();
        three.display();
        one2.TurnOn();
        two2.TurnOn();
    }

}
