package basicjava;

public class SeriesSum {
    public static void main(String[] args) {
        double sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += 1.0/((double)i + 1.0);
        }
        System.out.println(sum);
    }
}
