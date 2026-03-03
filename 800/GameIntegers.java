import java.util.Scanner;

public class GameIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int integer = sc.nextInt();
            //int Fin = 0;
            if(integer%3==1 || integer%3==2){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}
