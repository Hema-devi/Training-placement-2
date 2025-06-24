import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        System.out.println("Sorted: " + new String(chars));
    }
}
