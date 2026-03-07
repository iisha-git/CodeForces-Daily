import java.util.Scanner;

public class PoliceRecruits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int events = sc.nextInt();
        int crimes = 0;
        int officers = 0;
        int occured[] = new int[events];
        for (int i = 0; i < occured.length; i++) {
            occured[i] = sc.nextInt();
        }
        for (int j = 0; j < occured.length; j++) {
            if(occured[j]<0){
                if(officers>0){
                    officers--;
                }else{
                    crimes++;
                }
            }
            if(occured[j]>0){
                officers+=occured[j];
            }
        }
        System.out.println(crimes);

    }
}
