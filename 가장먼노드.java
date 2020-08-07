import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        Map<Integer, Node> nM = new HashMap<>();
        for(int th=1;th<=n;th++) {
            Node node = new Node(th);
            nM.put(th, node);
        }
    
        for(int[] e:edge) {
            nM.get(e[0]).nexts.add(nM.get(e[1]));
            nM.get(e[1]).nexts.add(nM.get(e[0]));
        }
    
        Queue<Node> q = new LinkedList<>();
        q.add(nM.get(1));
        int maxCount=0;
        while(!q.isEmpty()){
            Node node = q.poll();
            for(Node next: node.nexts) {
                if(next.i>1 && next.count==0) {
                    next.count = node.count+1;
                    q.add(next);
                }
                maxCount = Math.max(maxCount, next.count);
            }          
        }
    
        final int finalMaxCount = maxCount; //stream에서 사용할 값은 final이어야 한다.
        return (int) nM.values().stream().filter(node->node.count==finalMaxCount).count(); //count는 long
    }
    
    static class Node{
        int i;
        int count;
        List<Node> nexts;
        
        Node(int i){
            this.i = i;
            this.count = 0;
            this.nexts = new LinkedList<>();
        }
    }
}
