class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = StringUtil.countCharOfString(s, 'p');
        int yCount = StringUtil.countCharOfString(s, 'y');
        
        if(pCount==0 && yCount==0) return true;
        
        return pCount == yCount;
    }
    
    public static class StringUtil{
        public static int countCharOfString(String s, char c){
            int count =0;
            for(int i=0; i<s.length() ; i++){
                if((s.charAt(i)+"").equalsIgnoreCase(c+"")) count++;
            }
            
            return count;
            
        }
    }
}

---
    
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int pCount = StringUtil.countCharOfString(s, 'p');
        int yCount = StringUtil.countCharOfString(s, 'y');
        
        if(pCount==0 && yCount==0) return true;
        
        return pCount == yCount;
    }
    
    public static class StringUtil{
        public static int countCharOfString(String s, char c){
            return (int) s.chars().filter(e->e==c).count();            
        }
    }
}

