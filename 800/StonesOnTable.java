import java.util.Scanner;
public class StonesOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stones = sc.nextInt();
        sc.nextLine();           
        String colours = sc.nextLine();
        int count = 0;
        for (int i = 1; i < colours.length(); i++) {
            if(colours.charAt(i)==colours.charAt(i-1)){
                count = count+1;
            }
        }
        System.out.println(count);
    }    
}
