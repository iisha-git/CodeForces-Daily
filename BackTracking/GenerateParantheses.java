package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
  
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        int open=0;
        int close=0;
        String curr = "";
        
        backtrack(n,ans,open,close,curr);
        return ans;
    }
    private void backtrack(int n,List<String> ans,int open,int close,String curr){
        if (curr.length() == 2 * n) {
        ans.add(curr);
        return;
    }

    // Try adding '('
    if (open < n) {
        backtrack(n, ans, open + 1, close, curr + "(");
    }

    // Try adding ')'
    if (close < open) {
        backtrack(n, ans, open, close + 1, curr + ")");
    }
    }
}
    

