package DNC;

public class Helper2D {
    public static boolean HelperTwoD(int [][]matrix, int target, int left , int right, int top, int bottom){
        if(left>right){
            return false;
        }

        if(top>bottom){
            return false;
        }

        int mid = (left+right)/2;
        int r = top;
        while (r<=bottom && matrix[r][mid]<=target) {
            if(matrix[r][mid] == target){
                return true;
            }

            r=r+1;
            
            return HelperTwoD(matrix, target, left, mid-1, r, bottom) || HelperTwoD(matrix, target, mid+1, right, top, r-1);

        }
        return false;
    }
    public static boolean TwoDmatrix(int[][]matrix,int target){

        return HelperTwoD(matrix, target, 0, matrix[0].length-1, 0, matrix.length-1);

    //    int m = matrix.length;
    //    for (int i = 0; i < m ; i++) {
    //     int n = matrix[i].length;
    //     for (int j = 0; j < n; j++) {
    //         if (matrix[i][j]==target) {
    //             return true;
    //         }
    //     }
    //    } 
    //    return false;
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
