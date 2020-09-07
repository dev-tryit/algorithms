import java.util.*;
import java.util.stream.*;
import java.util.concurrent.atomic.*;

class Solution {
    public String solution(String s) {
        //split를 쓰면 공백을 삭제하기 때문에,
        //내가 원하는 작업만 할 수 없다. 이게 함정이다.
        
        AtomicInteger i = new AtomicInteger(0);
        return Arrays.stream(s.split("")).map(charS->{
            if(charS.equals(" ")) {
                i.set(0);
                return " ";
            }
            
            return (i.getAndIncrement()%2==0) ? charS.toUpperCase() : charS.toLowerCase();
        }).reduce("",(t,word)->t+word);
    }
}
