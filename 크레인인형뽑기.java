import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        Game game = new Game(board);
        game.moveAndBoom(moves);
        return game.getBoomCount();
    }
    
    public static class Game {
        public List<Stack<Integer>> dollSquare;
        public Stack<Integer> boomStack;
        public int boomCount;
        
        public Game(int[][] board){
            boomCount=0;
            
            boomStack = new Stack<>();
            
            dollSquare = new ArrayList<>();
            for(int y=board.length-1 ; y>=0 ; y--) {
                for(int x=0 ; x<board[0].length ; x++) {
                    if(!dollSquare.contains(x)) {
                        dollSquare.add(new Stack<>());
                    }
                    
                    int v = board[y][x];
                    if(v == 0) continue;
                    dollSquare.get(x).push(v);
                }
            }
        }
        
        public int getBoomCount(){
            return boomCount;
        }
        
        public void moveAndBoom(int[] moves){
            for(int th : moves) {
                move(th-1);
                boom();
            }
        }        
        
        private void move(int i){
            Stack<Integer> stack = dollSquare.get(i);
            while(!stack.isEmpty()) {
                Integer n = stack.pop();
                if(n.equals(0)) continue;

                boomStack.push(n);
                break;
            }
        }
        
        private void boom(){
            if(boomStack.size()>=2) {
                Integer l = boomStack.pop();
                
                if(boomStack.peek().equals(l)) {
                    boomStack.pop();
                    boomCount += 2;
                }
                else {
                    boomStack.push(l);
                }
            }
        }
    }
}
