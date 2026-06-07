package DNC;

public class ToDMatrix {
    public static boolean HelperTwoD(int [][]matrix, int target,)
    public static boolean TwoDmatrix(int[][]matrix,int target){
       int m = matrix.length;
       for (int i = 0; i < m ; i++) {
        int n = matrix[i].length;
        for (int j = 0; j < n; j++) {
            if (matrix[i][j]==target) {
                return true;
            }
        }
       } 
       return false;
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int target = 1;

        boolean result = TwoDmatrix(matrix, target);

        System.out.println(result);
    }
}
