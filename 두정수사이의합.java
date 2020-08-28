class Solution {
    public long solution(int a, int b) {
        if(a==b) return a;
        
        int max = a>b ? a : b;
        int min = a<b ? a : b;
        
        long sum=0;
        for(int i = min ; i<= max ; i++) {
            sum += i;
        }
        
        return sum;
    }
}
