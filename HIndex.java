import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] citations) {
        return getHIndex(citations);
    }
    
    public int getHIndex(int[] citations) {
        Arrays.sort(citations);
        
        int hIndex=0;
        for(int i = citations.length-1; i > -1; i--) {
            int countOfResearch = citations.length - i; //h번이상 인용된 논문의 수
            int hCandidate = Math.min(citations[i],countOfResearch); //논문의 수가 h편이상이 되는값. 두 수의 최소값을 구한다.
            hIndex = Math.max(hCandidate,hIndex); //최대의 hIndex를 구한다.
        }
        
        return hIndex;
    }
}

---

import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] citations) {
        return getHIndex(citations);
    }
    
    public int getHIndex(int[] citations) {
        int countOfResearch = citations.length;
        Arrays.sort(citations);
        
        int hIndex=0;
        for(int h=0;h<Arrays.stream(citations).max().getAsInt();h++) {
            System.out.println(h);
            //h번이상 인용된 논문의 수
            int count=0; 
            for(int citation : citations) {
                if(citation>=h) count++;
            }
            
            //해당 논문이 h편이상
            if(count>=h) {
                hIndex = h;
                continue;
            }
            
            return hIndex;
        }
        return hIndex;
    }
}
