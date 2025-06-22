import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rand = new Random();

        for(int i = 0; i < 8; i++) {
            int index = rand.nextInt(chars.length());
            sb.append(chars.charAt(index));
        }

        System.out.println("Password: " + sb.toString());
    }
}
