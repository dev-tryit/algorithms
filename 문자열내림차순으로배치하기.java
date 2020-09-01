import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String s) {
        //s.chars는 IntStream이다. mapToObj를 통해 다른 Stream으로 만들자.
        return s.chars().mapToObj(c->String.valueOf((char)c)).sorted((nextC,prevC)->{
            if(prevC.compareTo(nextC)<0) return -1;
            return 1;
        }).reduce("",(t,c)->t+""+c);
    }
}
