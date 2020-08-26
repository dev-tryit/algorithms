import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int v : arr) {
            if(v%divisor == 0) pq.add(v);
        }        
        
        int[] answer = Stream.generate(pq::poll).limit(pq.size()).mapToInt(a->a).toArray();
        return answer.length!=0 ? answer : new int[]{-1};
    }
    
    
}
