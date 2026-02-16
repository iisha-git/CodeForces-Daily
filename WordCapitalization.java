import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = Character.toUpperCase(str.charAt(0))+str.substring(1,str.length());
        System.out.println(result);
    }
}
