import java.util.Scanner;

public class AplusB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String num = sc.nextLine();
            int result =Character.getNumericValue(num.charAt(0))+Character.getNumericValue(num.charAt(1));
            System.out.println(result);
        }

    }
}
