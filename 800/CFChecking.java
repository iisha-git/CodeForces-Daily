    import java.util.Scanner;

    public class CFChecking{
        public static void main(String[] args) {
            Scanner sc  = new Scanner(System.in);
            int t = sc.nextInt();
            sc.nextLine();
            String cf = "codeforces";
            for (int i = 0; i < t; i++) {
            char ch = sc.next().charAt(0);

            if (cf.indexOf(ch) != -1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            }
        }
    }