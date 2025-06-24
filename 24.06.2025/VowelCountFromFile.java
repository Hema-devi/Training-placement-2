import java.io.File;
import java.util.Scanner;

public class VowelCountFromFile {
    public static void main(String[] args) throws Exception {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int count = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            for(char c : line.toCharArray()) {
                if("aeiou".indexOf(c) != -1) count++;
            }
        }
        System.out.println("Total vowels: " + count);
        sc.close();
    }
}
