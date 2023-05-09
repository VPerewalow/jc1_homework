package part5.Task33;

public class KitMachine extends Machine  {
    String brandName;

    public KitMachine(String name, String brandName) {
        super(name);
        this.brandName = brandName;
    }

    @Override
    public void display() {
        super.display();
    }

    public void brandName() {
        System.out.println(name + "  " + brandName);
    }
}
