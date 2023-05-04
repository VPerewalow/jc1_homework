package lesson15;

import lesson4.Car;

import java.awt.*;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Parking parking = new Parking();

        ParkingTicket ticket1 = parking.park(new Car(Color.BLUE, "BMW X6"));
        ParkingTicket ticket2 = parking.park(new Car(Color.RED, "Mini Cooper"));

        for (Car car : parking.getCars()) {
            System.out.println(car);
        }
        ParkingTicket ticket3 = new ParkingTicket();
        System.out.println(parking.checkCarOnParking(ticket1));
        System.out.println(parking.checkCarOnParking(ticket2));
        System.out.println(parking.checkCarOnParking(ticket3));
    }
}
