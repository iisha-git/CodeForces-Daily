import java.util.Scanner;

public class GeorgeAccom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rooms = sc.nextInt();
        //boolean isAvailable = false;
        int count = 0;   
        for (int i = 0; i <Rooms; i++) {
            int occupied = sc.nextInt();
            int space = sc.nextInt();
            if(space-occupied>=2){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
