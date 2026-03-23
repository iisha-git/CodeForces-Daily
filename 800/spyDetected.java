import java.util.Scanner;

public class spyDetected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int []arr = new int[n];   
            int common; 
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            if(arr[0]==arr[1]){
                common = arr[0];
            }else{
                common = arr[2];
            }
            for (int j = 0; j < n; j++) {
                if(arr[j]!=common){
                    System.out.println(j+1);
                    break;
                }
            }
        }
    }
}
