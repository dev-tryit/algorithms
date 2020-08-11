class Solution {
    static int N;
    static int number;
    static int answer = -1;
    public int solution(int N, int number) {
        
        this.N = N;
        this.number = number;
        
        dfs(0,0);
        
        return answer;
    }
    
    static void dfs(int prev,int cnt){ 
        int TEMP_N = N;
        
        if(cnt>8) {
            answer=-1;
            return;
        }
        
        if(prev == number) {
            if(answer == -1 || answer > cnt) {
                answer = cnt;
            }
            return;
        }
        
        for(int i=0; i<8-cnt ; i++) {
            dfs(prev+TEMP_N,cnt+i+1);
            dfs(prev-TEMP_N,cnt+i+1);
            dfs(prev*TEMP_N,cnt+i+1);
            dfs(prev/TEMP_N,cnt+i+1);
            TEMP_N = TEMP_N * 10 + N;
        }
        
    }
}
