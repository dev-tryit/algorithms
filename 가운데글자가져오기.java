class Solution {
    public String solution(String s) {
        return StringUtil.getMiddle(s);
    }
    
    public static class StringUtil{
        public static String getMiddle(String s){
        int count = s.length();
        boolean isEven = count%2==0;
        
        int start = isEven ? count/2-1 : Math.round(count/2);
        int end = isEven ? start+2 : start+1;
        return s.substring(start,end);
        }
    }
}
