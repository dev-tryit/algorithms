class Solution {
    public boolean solution(String s) {
        return isCheck(s);
    }
    
    public boolean isCheck(String s){
        try{
            //숫자만으로 구성됨
            Integer.parseInt(s);
            int l = s.length();        
            return (l==4 || l==6);
        }
        catch(Exception e) {
            return false;
        }
    }
}
