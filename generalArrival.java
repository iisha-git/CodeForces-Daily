import java.util.Scanner;

public class generalArrival{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        //assumption
        int min = arr[0];
        int minIndex= 0;

        int max = arr[0];
        int maxIndex=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]<=min){
                min=arr[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>max){
                max=arr[i];
                maxIndex = i;
            }
        }
        /*
        System.out.println("max");
        System.out.println(maxIndex);
        System.out.println(max);
        System.out.println("min");
        System.out.println(minIndex);
        System.out.println(min);
         */

        //steps
        int maxSteps = maxIndex;
        int minSteps = n-1-minIndex;
        int steps = maxSteps+minSteps;
        if(maxIndex>minIndex){
            steps--;
        }

        System.out.println(steps);
    }
}