package part5.Task33;

public class ColorMachine extends KitMachine {

    public ColorMachine(String name, String brandName, String color, double price) {
        super(name, brandName);
        this.color = color;
        this.price = price;
    }

    String color;
    double price;

    public ColorMachine(String name, String brandName) {
        super(name, brandName);

    }

    @Override
    public void display() {
        System.out.println(name + " " + brandName + " " + color + " " + price + " $");
    }
}
