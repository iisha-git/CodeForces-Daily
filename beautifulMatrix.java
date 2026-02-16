import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]mat = new int[5][5];
        int row = 0,col=0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j]==1){
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row-2)+Math.abs(col-2);
        System.out.println(moves);
        /*
         for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = sc.nextInt();
                if(val==1){
                    row = i;
                    col = j;
                }
            }
        }
        int moves = Math.abs(row-3)+Math.abs(col-3);
        System.out.println(moves);
         */
        
    }
}
