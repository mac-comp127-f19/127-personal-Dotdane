package basicjava;

import java.util.Scanner;

public class OddEven {
    public static boolean isOdd(int value) {
        if(Math.abs(value) % 2 == 0) {
            return false;
        }
        else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        if(isOdd(number)) {
            System.out.println("Wow, that’s odd!");
        }
    }
}
