import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] seoul) {
        OptionalInt optionalIndex = IntStream.range(0,seoul.length).filter(i->seoul[i].equals("Kim")).findFirst();
        return String.format("김서방은 %d에 있다", optionalIndex.getAsInt());
    }
}
