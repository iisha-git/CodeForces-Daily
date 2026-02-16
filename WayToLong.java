import java.util.Scanner;

public class WayToLong {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int t  = sc.nextInt();
    sc.nextLine();
    while(t-- >0){
        String word = sc.nextLine();
    if(word.length()<=10){
        System.out.println(word);
    }else{
        int count = word.length()-2;
        String newWord ="" +  word.charAt(0)+count+word.charAt(word.length()-1);
        System.out.println(newWord);
    }

    }
  }  
}

