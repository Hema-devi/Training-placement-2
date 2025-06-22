import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;

        for(int val : arr) {
            if(val > first) {
                second = first;
                first = val;
            } else if(val > second && val != first) {
                second = val;
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
