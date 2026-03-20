import java.util.Scanner;

public class TwoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int distance = Math.abs(a-b);
            int moves = (int)Math.ceil((double)distance/10);
            System.out.println(moves);
        }
    }
}
