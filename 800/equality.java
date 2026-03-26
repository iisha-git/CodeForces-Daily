import java.util.Scanner;

public class equality {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int max = 0;
    int sum = 0;
    for (int i = 0; i < t; i++) {
        int x = sc.nextInt();
        sum+=x;
        if(x>max){
            max = x;
        }
    }
    System.out.println((max * t)-sum);

   } 
}
