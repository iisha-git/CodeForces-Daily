import java.util.Scanner;

public class petyaString {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String String1 = sc.nextLine();
        String String2 = sc.nextLine();

        String str1=String1.toLowerCase();
        String str2=String2.toLowerCase();

        int result = str1.compareTo(str2);
        if(result==0){
            System.out.println("0");
        }else if(result>0){
            System.out.println("1");
        }else if(result<0){
            System.out.println("-1");
        }
    }
    
}
