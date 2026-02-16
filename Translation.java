import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Berland = sc.nextLine();
        String Birland = sc.nextLine();
        int n =Berland.length();
        boolean isBirland = true;

        for (int i = 0; i < Berland.length(); i++) {
            if(Berland.charAt(i)!=Birland.charAt(n-1-i)){
                isBirland = false;
                break;
            }
        }
        if(isBirland){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
