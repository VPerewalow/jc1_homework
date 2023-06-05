package lesson19;

import java.io.*;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

public class CarController {

    public List<CarValueObject> readFromFile(File file) throws IOException {

        new BufferedReader(new FileReader(file))
                .lines()
                .map(s -> s.split(","))
                .map(ars -> new CarValueObject(
                        ars[0],
                        CarColor.BLUE,
                        BodyType.COUPE,
                        Short.parseShort(ars[3]),
                        Integer.parseInt(ars[4]),
                        ars[5],
                        Byte.parseByte(ars[6]),
                        new BigDecimal(ars[7]))
                )
                .peek(System.out::println)
                .collect(Collectors.toList());

        return null;
    }

    public static void main(String[] args) {
        try {
            CarController controller = new CarController();
            controller.readFromFile(new File(args[0]));
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
