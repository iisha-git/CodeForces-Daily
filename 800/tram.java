import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        int max = 0;
        int current = 0;
        Scanner sc =new Scanner(System.in);
        int Stops = sc.nextInt();
        for (int i = 0; i < Stops; i++) {
            int left = sc.nextInt();
            current = current-left;
            int newCurrent = sc.nextInt();
            current = current+newCurrent;
            if(current>=max){
                max = current;
            }
        }
        System.out.println(max);
    }
    
}
