import java.util.Scanner;

public class RestoreNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int []arr = new int[4];
        int a = 0;
        int b = 0;
        int c = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];    
            }
        }
        int count = 0;
        int[] result = new int[3];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=max){
                result[count]=max-arr[i];
                count++;
            }
        }
        System.out.println(result[0]+" "+result[1]+" "+result[2]);
    }
    
}
