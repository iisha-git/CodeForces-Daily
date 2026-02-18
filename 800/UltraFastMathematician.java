import java.util.Scanner;

public class UltraFastMathematician {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String output="";
        for (int i = 0; i < input1.length(); i++) {
           if(input1.charAt(i)==input2.charAt(i)){
            output=output+'0';
           }else{
            output=output+'1';
           }
        }
        System.out.println(output);
    }
    
}
