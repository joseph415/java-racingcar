package utils;

import java.util.Random;

public class RandomNumberUtils {
    private static final Random RANDOM = new Random();

    public static int makeRandomNumber(){
        return RANDOM.nextInt(10);
    }
}
