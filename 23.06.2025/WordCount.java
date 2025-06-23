import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        String word = sc.next().toLowerCase();

        String[] words = sentence.split("\\s+");
        int count = 0;
        for(String w : words) {
            if(w.equals(word)) count++;
        }

        System.out.println("Count: " + count);
    }
}
