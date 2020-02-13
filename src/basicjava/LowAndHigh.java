package basicjava;

import java.util.Scanner;

public class LowAndHigh {
    public static void main(String[] args) {
        int low = 0, high = 0, input = 0;
        Scanner scanner = new Scanner(System.in);


        while (input >= 0) {
            System.out.print("Enter value: ");
            input = scanner.nextInt();
            if (input < 0) {
                break;
            }
            if (input < low) {
                low = input;
            }
            if (input > high) {
                high = input;
            }
        }
        System.out.println("Low: " + low);

        System.out.println("High: " + high);
    }
}
