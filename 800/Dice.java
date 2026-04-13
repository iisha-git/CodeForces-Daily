import java.util.*;

public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();
        int W = sc.nextInt();

        int M = Math.max(Y, W);
        int num = 7 - M;

        if (num == 6) System.out.println("1/1");
        else if (num == 5) System.out.println("5/6");
        else if (num == 4) System.out.println("2/3");
        else if (num == 3) System.out.println("1/2");
        else if (num == 2) System.out.println("1/3");
        else if (num == 1) System.out.println("1/6");
    }
}