import java.util.Scanner;

public class TextStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.useDelimiter("\\Z").next();

        int lines = input.split("\r\n|\r|\n").length;
        int words = input.trim().split("\\s+").length;
        int chars = input.length();

        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}
