package basicjava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MultTables {
    public static void main(String[] args) {
//        int size = 1000;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = scan.nextInt();

        int[][] multTable = new int[size + 1][size + 1];
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size + 1; j++) {
                multTable[i][j] = i * j;
                String out = "" + i * j;

                while (out.length() < (size * size + "").length()) {
                    out += " ";
                }

                if (out.charAt(0) != '0') {
                    System.out.print(out);
                }
            }
            System.out.println();
        }
    }
}
