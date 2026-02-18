import java.util.Scanner;

public class Pnagram {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine().toLowerCase();
        boolean[] letters = new boolean[26];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                letters[ch-'a']=true;
            }
        }
        int count = 0;

    for (int i = 0; i < 26; i++) {
        if (letters[i]) {
            count++;
        }
    }

    if (count == 26) {
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }


   }     
}
