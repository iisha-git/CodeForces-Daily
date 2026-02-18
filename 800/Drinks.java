import java.util.Scanner;

public class Drinks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of drinks
        double Sum = 0;
        for (int i = 0; i < n; i++) {
            int Drink = sc.nextInt();
            Sum = Sum+Drink;
        }
        double result = Sum/n;
        System.out.println(result);
    }
}
