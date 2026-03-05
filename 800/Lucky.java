import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String num = sc.nextLine();
            if(num.charAt(0)+num.charAt(1)+num.charAt(2)==num.charAt(3)+num.charAt(4)+num.charAt(5)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            
        }
    }
}
