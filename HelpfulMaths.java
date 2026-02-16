import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String[] parts = s1.split("\\+");

        int []arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print("+");
            }
            System.out.print(arr[i]);
        }
    }
}

