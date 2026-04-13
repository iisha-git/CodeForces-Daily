import java.util.*;

public class Blocked{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            boolean []used = new boolean[n];
            int sum = 0;

            int result[] = new int[n];
            int idx=0;
            boolean possible = true;
            for (int j = 0; j < result.length; j++) {
                boolean found = false;
                for (int k = 0; k < n; k++) {
                    if(!used[k] && arr[k]>sum){
                        result[idx] = arr[k];
                        idx++;
                        sum+=arr[k];
                        used[k]=true;
                        found=true;
                        break;
                    }
                }
                if(!found){
                    possible = false;
                    break;
                }
            }
            if(!possible){
                System.out.println(-1);
            }else{
                for(int x:result){
                    System.out.print(x+" ");
                }
                System.out.println();
            }
        }
    }
}