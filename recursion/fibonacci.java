package recursion;

import java.util.*;

public class fibonacci {
    Map<Integer,Integer> map = new HashMap<>();
    public int fib(int n) {
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n<=1){
            return n;
        }
        int res = fib(n-1)+fib(n-2);
        map.put(n, res);
        return map.get(n);
        // if(n==0) return 0 ;
        // int num1 =0;
        // int num2 =1;
        // for(int i=2 ; i<=n; i++){
        //     int num3 = num1+num2;
        //     num1=num2;
        //     num2=num3; 
        // } 
        // return num2;
    }
}
