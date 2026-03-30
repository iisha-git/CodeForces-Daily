import java.util.Scanner;

public class PreAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int l = 0  ;
            int r = n-1;

            while(l<r && s.charAt(l) != s.charAt(r)){
                l++;
                r--;
            }
            System.out.println(r-l+1);
        }
    }
}
