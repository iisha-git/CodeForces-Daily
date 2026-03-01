import java.util.Scanner;

public class ILove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contests = sc.nextInt();
        //sc.nextLine();
        int scores[] = new int[contests];
        int max;
        int min;
        int Amazingcount = 0;
        for (int i = 0; i < contests; i++) {
            scores[i] = sc.nextInt();
        }
        max = scores[0];
        min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if(scores[i]>max){
                Amazingcount++;
                max=scores[i];
            }else if(scores[i]<min){
                Amazingcount++;
                min=scores[i];
            }
        }

        System.out.println(Amazingcount);
    }
}
