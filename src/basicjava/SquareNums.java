package basicjava;

import java.util.Scanner;

public class SquareNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = -1;
        while ((number*number) % 4 != 0) {
            System.out.print("Enter number: ");
            number = scan.nextInt();
            System.out.println(number*number);
        }
    }
}
