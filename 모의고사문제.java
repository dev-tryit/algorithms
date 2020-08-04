import java.util.*;
import java.lang.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] aA) {
        //준비
        int[][] pAA = new int[][]{
                new int[]{1, 2, 3, 4, 5},
                new int[]{2, 1, 2, 3, 2, 4, 2, 5},
                new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        //계산
        int maxCount = 0;
        int[] cA = new int[pAA.length];
        for (int i = 0; i < pAA.length; i++) {
            int[] pA = pAA[i];
            if (i >= pA.length || i >= aA.length)
                break;

            int count = 0;
            for (int j = 0; j < aA.length; j++) {
                Integer pV = pA[j % pA.length];
                Integer aV = aA[j];

                if (pV.equals(aV)) count++;
            }
            cA[i] = count;
            maxCount = Math.max(maxCount, count);
        }

        //반환값 생성
        List<Integer> r = new ArrayList<>();
        for (int i = 0; i < cA.length; i++) {
            if (cA[i] - maxCount == 0) {
                r.add(i + 1);
            }
        }
        r.sort(null);
        return r.stream().mapToInt(i -> i.intValue()).toArray();
    }
}
