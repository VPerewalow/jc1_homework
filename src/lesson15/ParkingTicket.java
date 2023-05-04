package lesson15;

import java.util.Random;
import java.util.UUID;

public class ParkingTicket {

    private final Integer id = new Random().nextInt(100_000);

    public Integer getId() {
        return id;
    }
}
