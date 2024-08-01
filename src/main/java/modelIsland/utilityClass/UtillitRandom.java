package modelIsland.utilityClass;

import java.util.Random;

public class UtillitRandom {
    private static Random random = new Random();

    public static synchronized int getRandom(int number) {
        return random.nextInt(number);
    }
}
