package basicjava;

import java.util.Scanner;

public class DrawPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scanner.nextInt();

        for (int i = 1; i < size + 1; i++) {
            for (int j = 0; j < size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            for (int k = 0; k < size - (i * 2) - 1; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}