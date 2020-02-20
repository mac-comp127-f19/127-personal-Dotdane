package activityStarterCode.objects;

import org.junit.platform.console.shadow.picocli.CommandLine;

public class Die {
    private final int DEFAULT_MAX_VALUE = 6;
    private final int maxValue;
    private int value = -1;

    public Die() {
        maxValue = DEFAULT_MAX_VALUE;
    }

    public Die(int sides) {
        maxValue = sides;
    }

    public void roll() {
        value = (int) (Math.random() * maxValue + 1);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == 1) {
            return "one";
        } else if (value == 2) {
            return "two";
        } else if (value == 3) {
            return "three";
        } else if (value == 4) {
            return "four";
        } else if (value == 5) {
            return "five";
        } else if (value == 6) {
            return "six";
        } else if (value == 7) {
            return "seven";
        } else if (value == 8) {
            return "eight";
        } else if (value == 9) {
            return "nine";
        } else if (value == 10) {
            return "ten";
        } else if (value == 11) {
            return "eleven";
        } else if (value == 12) {
            return "twelve";
        } else if (value > 12) {
            return "more than twelve";
        } else {
            return "error";
        }
    }
}