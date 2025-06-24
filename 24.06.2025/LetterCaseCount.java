import java.util.Scanner;

public class LetterCaseCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upper = 0, lower = 0;
        for(char c : str.toCharArray()) {
            if(Character.isUpperCase(c)) upper++;
            else if(Character.isLowerCase(c)) lower++;
        }
        System.out.println("Uppercase: " + upper);
        System.out.println("Lowercase: " + lower);
    }
}
