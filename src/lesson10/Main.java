package lesson10;

public class Main {
    public static void main(String[] args) {
        boolean isObject;
        int[] numbers = {1,2,3};
        isObject = numbers instanceof Object;
        System.out.println("Array is object: " + isObject);
        String[] string = {"s1", "s2", "s3"};
        isObject = string instanceof String[];
        System.out.println("String Array is object: " + isObject);

        PizzaOrderStatus status = PizzaOrderStatus.NewOrder;
        status.setProgress(Progress.START);
        System.out.println(status + ": " + status.ordinal() + " progress: " + status.getProgress());
        status.setProgress(Progress.FINISH);
        System.out.println(status + ": " + status.ordinal() + " progress: " + status.getProgress());

        status = PizzaOrderStatus.Delivery;
        System.out.println(status + ": " + status.ordinal() + " time: " + status.getMaxExecutionTime());

        isObject = status instanceof Object;
        System.out.println("Is enum object: " + isObject);


        Pizza pizza = new Pizza();
        //pizza.notify(); //Inherited
        System.out.println(pizza.getClass().getName());
        pizza.setName("Margarita");
        System.out.println(pizza.getName());

    }
}
