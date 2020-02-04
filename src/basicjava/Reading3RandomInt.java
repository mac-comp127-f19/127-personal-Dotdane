package basicjava;

import java.util.Scanner;

public class Reading3RandomInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int upperLimit = 0;

        while (upperLimit >= 0) {
            System.out.print("Enter a positive integer: ");
            upperLimit = scanner.nextInt();

            int random = (int) (Math.random() * (upperLimit + 1));
            System.out.println(random);
        }
    }
}
