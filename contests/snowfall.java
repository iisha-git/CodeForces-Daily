import java.util.*;

public class snowfall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();

            List<Integer> both = new ArrayList<>();
            List<Integer> two = new ArrayList<>();
            List<Integer> three = new ArrayList<>();
            List<Integer>none = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int x = sc.nextInt();
                if(x%6==0){
                    both.add(x);
                }else if(x%2==0){
                    two.add(x);
                }else if(x%3==0){
                    three.add(x);
                }else{
                    none.add(x);
                }
            }
            for(int x:both) System.out.print(x+" ");
            for(int x:two) System.out.print(x+" ");
            for(int x:three)System.out.print(x+" ");
            for(int x:none)System.out.print(x+" ");
            System.out.println();
        }
    }
}
