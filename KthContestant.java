import java.util.Scanner;

public class KthContestant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        int[] scores = new int[n];

        for (int i = 0; i < n ; i++) {
            scores[i] = sc.nextInt();
        }

        for (int i : scores) {
           if(i>=scores[k-1] && i >0){
            count++;
           } 
        }

        System.out.println(count);

    }
}
