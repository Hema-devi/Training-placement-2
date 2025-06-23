public class MaxInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {3, 8, 2},
            {5, 12, 7},
            {9, 4, 6}
        };

        int max = mat[0][0];
        for(int[] row : mat) {
            for(int val : row) {
                if(val > max)
                    max = val;
            }
        }

        System.out.println("Max value: " + max);
    }
}
