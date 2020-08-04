import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int s : scoville) q.add(s);

        //mix
        int count = 0;
        while (true) {
            Integer aV = q.poll();
            if(aV > K) return count;

            if (q.size() == 0) break;
            Integer bV = q.poll();

            Integer kV = aV + (bV * 2);
            q.add(kV);

            count += 1;
        }

        return -1;
    }
}
