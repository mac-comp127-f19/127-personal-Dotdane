package basicjava;

public class DoNDrills {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++) {
            System.out.print(i);
        }

        for(int i = 10; i >= 0; i--) {
            System.out.print(i);
        }

        int powTwo;
        for (int i = 1; i <= 8; i++) {
            powTwo = 1;
            for(int j = 0; j < i; j++) {
                powTwo *= 2;
            }
            System.out.println(powTwo);
        }

        for (int i = 1; i <= 8; i++) {
            powTwo = 1;
            for(int j = 0; j < i; j++) {
                powTwo *= 2;
            }
            System.out.println(powTwo-1);
        }

        for (int i = 1; i <= 25; i+=2) {
            System.out.println(Math.sqrt(i));
        }
    }
}
