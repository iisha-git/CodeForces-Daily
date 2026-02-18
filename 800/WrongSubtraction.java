import java.util.Scanner;

public class WrongSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();
        int times = sc.nextInt();
        for (int i = 0; i < times; i++) {
            if(Number%10==0){
                Number = Number/10;
            }else{
                Number = Number-1;
            }
        }
        System.out.println(Number);
    }
}
