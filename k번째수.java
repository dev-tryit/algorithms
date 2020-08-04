mport java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] r = new int[commands.length];
        
        for(int i=0; i<commands.length ; i++) {
            int[] c = commands[i];
            r[i] = extract(array,c[0]-1,c[1]-1,c[2]-1);
        }
        
        return r;
    }
    
    public int extract(int[] a, int i,int j,int k){
        int[] sub = new int[j-i+1];
        
        int c=0;
        for(int index = i; index<=j ; index++) {
            sub[c] = a[index];
            c++;
        }
        Arrays.sort(sub);
        
        return sub[k];
        
    }
}
