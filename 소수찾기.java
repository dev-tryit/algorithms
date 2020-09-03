import java.util.*;
import java.util.stream.*;

class Solution {
    //에라토스테네스의 체
    public int solution(int n) {
        int[] che = IntStream.range(0,n+1).toArray();
        
        for(int i=2 ; i*i<n ; i++) { //1.i*i를 곱해서, n을 넘으면 안해도된다.
            if(che[i]==-1) continue;
            for(int j=2*i;j<=n; j+=i) che[j] = -1; // 2. 배수를 지워나간다.
        }
        
        return (int) Arrays.stream(che).filter(i->i!=-1).count()-2; //3. 0,1을 제외한다.
    }
}
