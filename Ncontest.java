import java.util.Scanner;

public class Ncontest{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int count  = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for ( int j = 1; j <=3 ; j++) {
                int sure =sc.nextInt();
                sum = sum+sure;
            }

            if(sum>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}