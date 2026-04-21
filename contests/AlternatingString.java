import java.util.*;

public class AlternatingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int tc = 0; tc < t; tc++) {
            String s = sc.next();
            int bad = 0;

            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    bad++;
                }
            }

            if (bad <= 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
