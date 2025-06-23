import java.util.Scanner;

public class CenturyYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println((year % 100 == 0) ? "Century Year" : "Not Century Year");
    }
}
