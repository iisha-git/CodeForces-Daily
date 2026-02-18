import java.util.Scanner;

public class easyProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isHard=false;
        for (int i = 0; i < n; i++) {
            int Pf = sc.nextInt();
            if(Pf==1){
                isHard=true;
            }
        }
        if(isHard==true){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }
    }
    
}
