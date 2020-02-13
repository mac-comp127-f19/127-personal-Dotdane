package basicjava;

public class SeriesSum2 {
    public static void main(String[] args) {
        double sum = 0;
        int i = 1;
        while (sum < 2) {
            sum += 1.0/((double)i + 1.0);
            i++;
        }
        System.out.println(i-1);
    }
}
