import java.util.Scanner;

public class Toasts {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int totalDrink = k * l;
        int drinkToasts = totalDrink / nl;

        int limeSlices = c * d;
        int limeToasts = limeSlices;

        int saltToasts = p / np;

        int totalToasts = Math.min(drinkToasts, Math.min(limeToasts, saltToasts));

        int result = totalToasts / n;

        System.out.println(result);

    }
}