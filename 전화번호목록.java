class Solution {
    public boolean solution(String[] phone_book) {
        for(String p:phone_book) {
            for(String p2:phone_book) {
                if(!p.equals(p2) && p.startsWith(p2)) return false;
            }
        }
        
        return true;
    }
}
