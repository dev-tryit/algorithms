import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String orderedSkillTree, String[] skillTreeList) {
        List<String> orderedSkillList = orderedSkillTree.chars().mapToObj(c->((char)c)+"").collect(Collectors.toList()); //orderedSkillTree.chars()는 intStream이다.
        
        int count=0;
        for(String skillTree : skillTreeList) {
            
            String requriedSkillTree = "";
            for(char skill : skillTree.toCharArray()) {
                if(orderedSkillList.contains(skill+"")) requriedSkillTree += skill+"";
            }
            
            if(orderedSkillTree.startsWith(requriedSkillTree)) count++;
            
        }
        
        return count;
    }
}
