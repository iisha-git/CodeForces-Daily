import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int home[]=new int[n];
        int away[]=new int[n];
        int count=0;
        for (int i = 0; i < n; i++) {
            home[i] = sc.nextInt();
            away[i] = sc.nextInt();
        }
        for (int i = 0; i < home.length; i++) {
            for (int j = 0; j < away.length; j++) {
                if(home[i]==away[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
