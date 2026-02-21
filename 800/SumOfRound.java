import java.util.Scanner;

public class SumOfRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        int num = sc.nextInt();
        int place = 1;
        String result = "";
        int count=0;
        while(num>0){
            int last = num%10;
            //System.out.println(last);
            num=num/10;
            if(last!=0){
                count++;
                int round= last*place;
                result = result+round+" ";
            }
            place*=10;
        }
        System.out.println(count);
        System.out.println(result);
        }

    }
}

