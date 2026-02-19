import java.util.Scanner;

public class FoxSnake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            if(i%2==0){
                for (int j = 0; j < cols; j++) {
                    System.out.print("#");
                }
            }else if(i%4==1){//right side
                for (int j = 0; j < cols-1; j=j+1) {
                    System.out.print(".");
                }
                System.out.print("#");
            }else{
                System.out.print("#");
                for (int j = 0; j < cols-1; j++) {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
