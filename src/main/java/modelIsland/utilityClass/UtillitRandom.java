package modelIsland.utilityClass;

import java.util.concurrent.ThreadLocalRandom;

public class UtillitRandom {

    public static int getRandom(int number) {
        return ThreadLocalRandom.current().nextInt(number);
    }
}
