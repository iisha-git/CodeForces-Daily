import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int arr[] = new int[3];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            
              if(arr[0]==arr[1]+arr[2] ||arr[1]==arr[0]+arr[2] || arr[2]==arr[0]+arr[1]){
                System.out.println("YES");
              }else{
                System.out.println("NO");
              }
            
        }
    }
}
