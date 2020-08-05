import java.util.*;

class Solution {
    public long solution(int n, int[] times) {
        //n은 1억이하, times의 요소는 1억 이하, times의 개수는 10만개이하.
        //1. 풀이
        //2. 코드 검토
        //3. Overflow 검토
        
        long l = 0;
        long r = (long)times[times.length-1] * n;
        
        long least = Long.MAX_VALUE;
        while(l<=r) {
            long m = (l+r)/2;
            
            long c=0;
            for(int t : times) c += m/t;
            
            if(c>=n) {
                r = m;
                if(least > r) least = r;
                r -= 1;
            } else {
                l = m;
                l += 1;
            }
        }
        
        return least;
        
    }
}
