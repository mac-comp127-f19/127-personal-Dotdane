package basicjava;

import java.util.Scanner;

public class SentinelDrills {
    public static boolean isOdd(int value) {
        if (Math.abs(value) % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while (number >= 0) {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if (number > 0 && isOdd(number)) {
                System.out.println("Wow, that’s odd!");
            }
        }
    }
}

