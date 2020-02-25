package basicjava;

import java.util.Scanner;

public class Hypotenuse {
    public static double calculateHypotenuse(double length1, double length2) {
        // Put your code here. It needs to return a value!
        double hypotenuse = Math.sqrt(length1*length1+length2*length2);
        return hypotenuse;
    }

    public static void main(String [] args) {
        // Your code goes here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length 1: ");
        double len1 = scanner.nextDouble();
        System.out.print("Enter length 2: ");
        double len2 = scanner.nextDouble();

        System.out.println(calculateHypotenuse(len1,len2));
    }
}
