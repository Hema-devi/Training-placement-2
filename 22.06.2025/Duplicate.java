import java.util.HashSet;
import java.util.Scanner;

public class DuplicateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for(int val : arr) {
            if(!set.add(val)) {
                System.out.println("Duplicate found: " + val);
                found = true;
            }
        }

        if(!found) System.out.println("No duplicates found");
    }
}
