import java.util.*;

class myAtoi {
    public int myAtoi(String s) {
       //"     123" -> 123
       //"    -123" -> -123
       //"    +123" -> 123
       //"    -042" -> -42
       //"   -0b4c2"-> -4

       int i =0;
       int num =0;

       int sign = 1; //default + , -1 for negative

        //1.  ignore leading space
        while(i<s.length() && s.charAt(i)==' '){
            i=i+1; 
        }

        //2. signedness
        if(i<s.length()){
            if(s.charAt(i)=='-'){
                sign=-1;
                i=i+1;
            }else if(s.charAt(i)=='+'){
                i=i+1;
            }
        }
        

        //3. conversion
        while(i<s.length() && isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';

            //rounding
            //2,147,483,647(2,147,483,64)
            //-2,147,483,648(2,147,483,64) 
            if(num > Integer.MAX_VALUE/10 || 
            (num == Integer.MAX_VALUE/10 && digit > 7)){
                if(sign == 1){
                    return Integer.MAX_VALUE;
                }else{
                    return Integer.MIN_VALUE;
                }
            }
            num = num*10+digit;
            i=i+1;
        }
       
        return sign*num;
    }
    public boolean isDigit(char c){
        return c>='0' && c<='9';
    } 
}   