import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = input.replaceAll("\\s+", "");
        System.out.println("Without spaces: " + result);
    }
}
