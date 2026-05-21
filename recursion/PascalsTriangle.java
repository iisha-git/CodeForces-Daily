package recursion;

import java.util.*;


public class PascalsTriangle {
    Map<String,Integer> map = new HashMap<>();
    public int getRowHelper(int row,int col){
       //bae case
       if(row==0||col==0||row==col){
        return 1;
       } 
        
        String key = Integer.toString(row)+" "+Integer.toString(col);
        if(map.containsKey(key)){
            return map.get(key);
        }
        int res = getRowHelper(row-1, col-1)+getRowHelper(row-1,col);
        
        map.put(key, res);
        return map.get(key);
    }


    public List<Integer> getRow(int rowIndex){
        List<Integer> res = new ArrayList<>();
        //row = 3;
        //col = 0,1,2,3
        int row = rowIndex;
        for (int col = 0; col<=rowIndex ; col++) {
            res.add(getRowHelper(row, col));
        }
        return res;
    }
}
