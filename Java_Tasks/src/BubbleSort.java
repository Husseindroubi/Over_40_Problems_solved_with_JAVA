
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {3, 2, 6, 7, 0, 1, 2, 4, 6, 8, 9, 10, 7};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j+1]) {
                    int sort = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = sort;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}