import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Map<Integer, Integer> lM = Arrays.stream(lost).boxed().collect(Collectors.toMap(e -> e, e -> 0));
        Map<Integer, Integer> rM = Arrays.stream(reserve).boxed().collect(Collectors.toMap(e -> e, e -> 0));

        for (Integer value : new HashSet<>(lM.keySet())) {
            if (value != null && value > 0 && rM.containsKey(value)) {
                rM.remove(value);
                lM.remove(value);
            }
        }

        label:
        for (Integer v : new HashSet<>(lM.keySet())) {
            int[] vL = new int[]{v - 1, v + 1};
            for (int val : vL) {
                if (val > 0 && rM.containsKey(val)) {
                    rM.remove(val);
                    lM.remove(v);
                    continue label;
                }

            }
        }

        return n - (lM.size());
    }
}
