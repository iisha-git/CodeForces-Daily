import java.util.*;
public class Word {
    public static void main(String[] args) {
        int upper = 0;
        int lower = 0;
        Scanner sc = new Scanner(System.in);
        String Word = sc.nextLine();

        for (int i = 0; i < Word.length(); i++) {
            char ch = Word.charAt(i);
            if(Character.isUpperCase(ch)){
                upper++;
            }else if(Character.isLowerCase(ch)){
                lower++;
            }
        }
        if(upper==lower){
           System.out.println(Word.toLowerCase());
        }else if(upper>lower){
            System.out.println(Word.toUpperCase());
        }else if(lower>upper){
            System.out.println(Word.toLowerCase());
        }   
    }
}
