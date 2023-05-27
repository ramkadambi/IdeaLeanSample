import java.util.Arrays;
import java.util.List;

class Welcome {
    public static void main(String[] args) {
        int[] array = {5, 6, 7, 8};
        System.out.printf("average of array %s is %s%n", Arrays.toString(array), findAverage(array));
    }

    private static double findAverage(int[] values) {
        double result = 0;
        for (int value : values) {
            result += value;
        }
        return result / values.length;
    }
}
