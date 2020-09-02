import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Map<Integer,Integer> returnMap = new LinkedHashMap<>();
        
        int maxFinishIndex = 0;
        for(int i=0;i<progresses.length;i++){
            int p = progresses[i];
            int s = speeds[i];
            
            int time = (int) Math.ceil((100-p)/((double)s));
            maxFinishIndex = Math.max(maxFinishIndex,time);
            
            Integer value = returnMap.get(maxFinishIndex);
            returnMap.put(maxFinishIndex, value!=null?value+1:1);
        }
        
        return returnMap.values().stream().mapToInt(i->i.intValue()).toArray();
    }
}
