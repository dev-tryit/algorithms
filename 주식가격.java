class Solution {
    public int[] solution(int[] prices) {
        int[] a = new int[prices.length];
        
        benchmark:
        for(int i=0;i<prices.length;i++) {
            for(int j=i+1;j<prices.length;j++) {
                int cV = prices[i];
                int nV = prices[j];
                
                a[i] = j-i;
                if(cV>nV) continue benchmark;
            }
        }
        
        return a;
    }
}
