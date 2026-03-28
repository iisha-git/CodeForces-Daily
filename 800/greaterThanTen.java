import java.util.Scanner;

public class greaterThanTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int arr[] = new int[3];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            if(arr[0]+arr[1]>=10){
                System.out.println("YES");
            }else if(arr[1]+arr[2]>=10){
                System.out.println("YES");
            }else if(arr[0]+arr[2]>=10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }   
        }
    }
}
