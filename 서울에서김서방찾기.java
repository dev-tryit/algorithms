import java.util.*;
import java.util.stream.*;

class Solution {
    //8배 빠르다.
    public String solution(String[] seoul) {
        for(int i=0; i< seoul.length ; i++) {
            if(seoul[i].equals("Kim")){
                return String.format("김서방은 %d에 있다", i);
            }
        }
        return "김서방이 없다.";
    }
}

---

import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] seoul) {
        OptionalInt optionalIndex = IntStream.range(0,seoul.length).filter(i->seoul[i].equals("Kim")).findFirst(); //IntStream은 List<OptionalInt>를 반환한다. getAsInt();
        return String.format("김서방은 %d에 있다", optionalIndex.getAsInt()); //stream은 특정조건에서 break를 하지 못하므로 비효율적이다.
    }
}
