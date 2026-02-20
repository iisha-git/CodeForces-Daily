import java.util.Scanner;

public class candiesSister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            long ways = sc.nextLong();
            System.out.println((ways-1)/2);
        }
    }
}
