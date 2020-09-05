class Solution {
    char[] upperAlpabatArr;
    char[] lowerAlpabatArr;
    
    public String solution(String s, int n) {
        int count=0;
        char c = 'a';  
        while('a'<=c&& c<='z') {
            c++;
            count++;
        }
        
        String returnStr = "";
        for(char charStr : s.toCharArray()) {
            if('a'<=charStr && charStr <='z') {
                returnStr+=(char)('a'+((charStr-'a'+n)%count));
                continue;
            }
            if('A'<=charStr && charStr <='Z') {
                returnStr+=(char)('A'+((charStr-'A'+n)%count));
                continue;
            } 
            returnStr+=" ";
        }
        
        return returnStr;
        
    }
}
