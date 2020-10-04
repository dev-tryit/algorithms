class Solution {
    public int[] solution(int brown, int yellow) {
        //2(w+h)-4 <= brown+4
        //w <= ((brown+4)/2) -h <= ((brown+4)/2)
        //h <= ((brown+4)/2) -w <= ((brown+4)/2)
        int w=0;
        while(w<=((brown+4)/2)){
            w++;
            int h=0;
            while(h<=((brown+4)/2)) {
                h++;
                if(
                    ((((w+h)*2)-4) == brown)
                  && ((w*h) == (brown+yellow))
                ) return new int[]{h, w};
            }
        }
        
        return new int[]{0, 0};
    }
}
