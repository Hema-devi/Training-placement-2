public class SymmetricMatrix {
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {2, 5, 6},
            {3, 6, 9}
        };

        boolean isSymmetric = true;
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat.length; j++) {
                if(mat[i][j] != mat[j][i]) {
                    isSymmetric = false;
                    break;
                }
            }
        }

        System.out.println(isSymmetric ? "Symmetric" : "Not Symmetric");
    }
}
