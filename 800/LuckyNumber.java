import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        int luckyCount = 0;

        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch == '4' || ch == '7') {
                luckyCount++;
            }
        }

        boolean isLucky = true;

        if (luckyCount == 0) {
            isLucky = false;
        } else {
            for (int x = luckyCount; x > 0; x /= 10) {
                int digit = x % 10;
                if (digit != 4 && digit != 7) {
                    isLucky = false;
                    break;
                }
            }
        }

        System.out.println(isLucky ? "YES" : "NO");
    }
}
