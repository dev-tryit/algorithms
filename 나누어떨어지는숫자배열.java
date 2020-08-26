import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = Arrays.stream(arr).filter(i->i%divisor==0).sorted().toArray();
        return answer.length != 0 ? answer : new int[]{-1};
    }
}

// import java.util.*;

// class Solution {
//     public int[] solution(int[] arr, int divisor) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>((next,prev)->{
//             if(prev.intValue()>next.intValue()) return -1;
//             return 1;
//         });
        
//         for(int v : arr) {
//             if(v%divisor == 0) pq.add(v);
//         }
        
//         int[] answer = new int[pq.size()];
//         for(int i=0;i<answer.length;i++) { //여기에 pq.size쓰면 안된다. pq가 작아지므로....... 
//             answer[i] = pq.poll();
//         }
//         return answer.length!=0 ? answer : new int[]{-1};
//     }
    
    
// }
