import java.util.Scanner;

public class elephant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int steps;
        if(distance%5==0){
            steps = distance/5;
            System.out.println(steps);
        }else{
            steps = distance/5;
            System.out.println(steps+1);
        }       
    }
    
}
