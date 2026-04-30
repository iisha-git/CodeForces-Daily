import java.util.Scanner;

public class Koshary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%2==1 && b%2==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
