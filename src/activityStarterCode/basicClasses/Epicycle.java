package activityStarterCode.basicClasses;

import java.util.Random;

public class Epicycle {
    private Random rng;
    private int value;
    int t;

    public Epicycle(int initial, int rate) {
        rng = new Random();
        value = initial;
        t = rate;
    }

    public int getValue() {
        return (int)Math.sin(Math.sin(t))*(300)/2+value;
    }

    public int advanceValue() {
        if(rng.nextBoolean()) {
            value++;
        } else {
            value--;
        }
        return value;
    }

    public int advanceValue(int stepSize) {
        if(rng.nextBoolean()) {
            for (int i = 0; i < stepSize; i++) {
                value++;
            }
        } else {
            for (int i = 0; i < stepSize; i++) {
                value--;
            }
        }
        return value;
    }
}
