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
