package problems.snakenladder;

import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int min = 1;
    int max = 6;

    public Dice(int count) {
        this.diceCount = count;
    }

    public int rollDice() {
        int sum = 0;
        int count = 0;

        while (count < diceCount) {
            int i = ThreadLocalRandom.current().nextInt(min, max + 1);
            sum += i;
            count++;
        }

        return sum;
    }
}
