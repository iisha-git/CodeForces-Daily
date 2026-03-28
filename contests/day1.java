import java.util.Scanner;

public class day1{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       
       for (int i = 0; i < t; i++) {
        int n = sc.nextInt();
        int[]p = new int[n];
        for (int j = 0; j < p.length; j++) {
            p[j] = sc.nextInt();
        }
        for (int j = 0; j < p.length; j++) {
            int x = p[j];
            int ans = Math.max(x,n-x+1);
            System.out.print(ans+" ");
        }
        System.out.println();
       }
    }
}




