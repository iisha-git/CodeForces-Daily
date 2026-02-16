import java.util.Scanner;

public class magnetGrounps{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String prev = sc.next();
        int groups=1;

        for (int i = 1; i < n; i++) {
            String curr = sc.next();
            if(!curr.equals(prev)){
                groups++;
            }
            prev=curr;
        }
        System.out.println(groups);
    }
}

/*
import java.util.Scanner;

public class magnetGrounps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        int max=0;
        for (int i = 0; i < n; i++) {
            int magnet = sc.nextInt();
            if(magnet==10){
                count++;
            }else if(magnet==01){
                count=0;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(max);
    }
    
}

*/