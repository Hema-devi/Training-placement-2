import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] alphabet = new boolean[26];
        for(char c : str.toCharArray()) {
            if(c >= 'a' && c <= 'z')
                alphabet[c - 'a'] = true;
        }

        boolean isPangram = true;
        for(boolean present : alphabet) {
            if(!present) {
                isPangram = false;
                break;
            }
        }
        System.out.println(isPangram ? "Pangram" : "Not Pangram");
    }
}
