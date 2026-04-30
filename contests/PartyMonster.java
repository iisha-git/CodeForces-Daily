import java.util.Scanner;

public class PartyMonster {
    public static void main(String [] main){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
           
            int open = 0; 
            int close = 0;
            
            for (int j = 0; j < n; j++) {
                if(s.charAt(j) == '('){
                    open++;
                }else{
                    close++;
                }
            }
            if(open==close){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
