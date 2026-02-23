import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        count += n/100;
        n = n%100;
        
        count+=n/20;
        n=n%20;

        count+=n/10;
        n=n%10;

        count+=n/5;
        n=n%5;

        count+=n/1;
        n=n%1;
        System.out.println(count);
    }
}
