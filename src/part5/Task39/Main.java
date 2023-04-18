package part5.Task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the first vehicle:");
        String name1 = scanner.nextLine();
        Garage<Car> garage1 = new Garage<>(new Car(name1));
        System.out.println("The first vehicle's name is " + garage1.getVehicle().name);

        System.out.println("Enter the name of the second vehicle:");
        String name2 = scanner.nextLine();
        Garage<Motorcycle> garage2 = new Garage<>(new Motorcycle(name2));
        System.out.println("The second vehicle's name is " + garage2.getVehicle().name);
    }
}
