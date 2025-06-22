import java.util.HashMap;
import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for(char key : map.keySet())
            System.out.println(key + ": " + map.get(key));
    }
}
