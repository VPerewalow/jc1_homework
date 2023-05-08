package part2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Task14 {
    public static void main(String[] args) {
        BigDecimal product = BigDecimal.valueOf(1);
        int i = 1;
        do {
            product = product.multiply(BigDecimal.valueOf(i));
            i++;
        } while (i <= 25);
        System.out.println(product);
    }
}


