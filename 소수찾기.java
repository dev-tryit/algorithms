import java.util.*;
import java.util.stream.*;

class Solution {
    //에라토스테네스의 체
    public int solution(int n) {
        int[] che = IntStream.range(0,n+1).toArray();
        
        for(int i=2 ; i*i<n ; i++) { //1.i*i를 곱해서, n을 넘으면 안해도된다.
            if(che[i]==0) continue; // 이미 지워진 수라면 건너뛰기
            for(int j=2*i;j<=n; j+=i) che[j] = 0; // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
        }
        
        return (int) Arrays.stream(che).filter(i->i!=0).count()-1; //1제외
    }
}
