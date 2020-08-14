import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers).boxed().sorted((b,f)->{
             String bS = b.toString();
             String fS = f.toString();
            
             return (fS+bS).compareTo(bS+fS);
        }).map(Object::toString).reduce("", (front,back)->front + back);
        return answer.startsWith("0") ? "0" : answer;
    }
}
