import java.util.*;
import java.util.stream.*;

public class Solution {
    public int[] solution(int []arr) {
        return NumberUtil.deleteConsecutiveNumberOfArr(arr);
    }
    
    public static class NumberUtil{
        public static int[] deleteConsecutiveNumberOfArr(int[] arr) {
            List<Integer> list = new ArrayList<>();
        
            for(int v : arr) {
                if(list.isEmpty()) {
                    list.add(v);
                    continue;
                }
                int lastV = list.get(list.size()-1);
                if(v!=lastV) list.add(v);
            }
            
            return list.stream().mapToInt(Integer::intValue).toArray();
            
        }
    }
}
