package basicjava;

import java.util.Scanner;

public class TimeConverter {
    public static int convertToSeconds(int hours, int minutes, int seconds) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        return totalSeconds;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter hours: ");
        int hours = scanner.nextInt();
        System.out.print("Enter minutes: ");
        int minutes = scanner.nextInt();
        System.out.print("Enter seconds: ");
        int seconds = scanner.nextInt();

        System.out.println("There are " + convertToSeconds(hours, minutes, seconds) + " seconds in " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");
    }
}
