import java.util.Scanner;

public class amuzing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] freq = new int[26];

        for (char c : guest.toCharArray()) {
            freq[c - 'A']++;
        }

        for (char c : host.toCharArray()) {
            freq[c - 'A']++;
        }

        for (char c : pile.toCharArray()) {
            freq[c - 'A']--;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}