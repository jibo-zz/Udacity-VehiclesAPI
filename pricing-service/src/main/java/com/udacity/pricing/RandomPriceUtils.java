package com.udacity.pricing;


import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPriceUtils {
    public static BigDecimal randomPrice() {
        return new BigDecimal(ThreadLocalRandom.current().nextDouble(1, 7))
                .multiply(new BigDecimal(7000d)).setScale(2, RoundingMode.HALF_UP);
    }
}
