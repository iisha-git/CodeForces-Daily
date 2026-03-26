import java.util.Scanner;

public class blankSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < arr.length; j++) {
                arr[j]=sc.nextInt();
            }
            int max = 0;
            int count=0;
            
            for (int j = 0; j < arr.length; j++) {

                if(arr[j]==0){
                    count++;
                }
                if(arr[j]==1){
                    count=0;
                }
                if(count>max){
                    max=count;
                }
            }
            System.out.println(max);
        }
    }
}
