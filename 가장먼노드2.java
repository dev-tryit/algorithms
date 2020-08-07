import java.util.*;

class Solution {
    public int solution(int n, int[][] edge) {
        List<Node> nL = new ArrayList<>();
        for(int i=0;i<=n;i++) {
            nL.add(new Node(i));
        }
        nL.get(0).visited=true;
        nL.get(1).visited=true;
        
        for(int[] e : edge) {
            nL.get(e[0]).nexts.add(nL.get(e[1]));
            nL.get(e[1]).nexts.add(nL.get(e[0]));
        }
        
        
        int max=0;
        Queue<Node> q = new LinkedList<>();
        q.add(nL.get(1));
        
        while(!q.isEmpty()) {
            Node node = q.poll();
            for(Node next:node.nexts) {
                if(!next.visited) {
                    next.count = node.count + 1;
                    next.visited = true;
                    q.add(next);
                    max = Math.max(max, next.count);
                }
            }
        }
        
        final int finalMax = max;
        return (int) nL.stream().filter(node->node.count == finalMax).count();
        
    }
    
    static class Node{
        int th;
        int count;
        List<Node> nexts;
        boolean visited;
        
        Node(int th) {
            this.th = th;
            this.count = 0;
            this.nexts = new ArrayList<>(); 
            this.visited = false;
        }
    }
}
