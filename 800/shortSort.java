import java.util.Scanner;

public class shortSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s = sc.next();
            if (s.equals("abc") || s.equals("acb") || 
                s.equals("bac") || s.equals("cba")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}