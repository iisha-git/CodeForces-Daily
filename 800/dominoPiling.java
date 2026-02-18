import java.util.Scanner;

public class dominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M  = sc.nextInt();
        int N  = sc.nextInt();
        int pizzasInside = (M*N)/2;
        System.out.println(pizzasInside);
    }
}
