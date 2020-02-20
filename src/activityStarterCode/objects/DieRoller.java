package activityStarterCode.objects;

public class DieRoller {
    public static void main(String[] args) {
        Die die1 = new Die(6);
        char firstChar;

        for (int i = 1; i < 11; i++) {
            die1.roll();

            firstChar = die1.toString().charAt(0);
            if (firstChar == 'a' ||firstChar == 'e' ||firstChar == 'i' ||firstChar == 'o' ||firstChar == 'u') {
                System.out.println("Roll " + i + " generated an " + die1);
            } else {
                System.out.println("Roll " + i + " generated a " + die1);
            }
        }
        Die die2 = new Die();

        int agreeCount = 0;
        for (int i = 0; i < 1000000; i++) {
            die1.roll();
            die2.roll();
            if (die1.getValue() == die2.getValue()) {
                agreeCount++;
            }
        }
        System.out.println("In 1,000,000 rolls, two dice agreed " + agreeCount + " times");

        Die die3 = new Die(12);
        for (int i = 1; i < 11; i++) {
            die3.roll();
            firstChar = die3.toString().charAt(0);
            if (firstChar == 'a' ||firstChar == 'e' ||firstChar == 'i' ||firstChar == 'o' ||firstChar == 'u') {
                System.out.println("Roll " + i + " generated an " + die3);
            } else {
                System.out.println("Roll " + i + " generated a " + die3);
            }
        }
    }
}
