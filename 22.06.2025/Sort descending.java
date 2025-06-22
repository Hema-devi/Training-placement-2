import java.util.Arrays;
import java.util.Collections;

public class SortDescending {
    public static void main(String[] args) {
        Integer[] arr = {5, 2, 8, 3, 1};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i : arr) System.out.print(i + " ");
    }
}
