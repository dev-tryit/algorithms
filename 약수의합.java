import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n) {
        return IntStream.range(1,n+1).boxed().filter(i->n%i==0).reduce(0,(t,c)->t+c);
    }
}
