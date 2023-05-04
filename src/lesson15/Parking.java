package lesson15;

import java.util.*;

import lesson4.Car;


public class Parking {

    Map<ParkingTicket, String> parkingTickets = new HashMap<>();


    private final List<Car> cars = new ArrayList<>(0);

    public Parking() {

    }

    public List<Car> getCars() {
        return List.copyOf(cars);
    }

    public void setCars(List<Car> cars) {
        if (cars != null & cars.size() > 0) {
            this.cars.addAll(cars);
            //this.cars = cars;
        }
    }

    public ParkingTicket park(Car car) {
        if (car == null) {
            return null;
        }
        ParkingTicket ticket = new ParkingTicket();
        parkingTickets.put(ticket, car.getPlateNumber());
        this.cars.add(car);
        return ticket;
    }

    public String checkCarOnParking(ParkingTicket ticket) {
        return parkingTickets.get(ticket);

    }
}
