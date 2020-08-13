import java.util.*;
import java.util.stream.*;

class Solution {
    
    public int solution(int[][] jobs) {
        int currentIndex = 0;
        List<Job> finishL = new ArrayList<>();
        
        Queue<Job> jobList = Arrays.stream(jobs).map(j->new Job(j[0],j[1]))
            .sorted((prev,next)->{
                if(prev.index<next.index) return -1;
                if(prev.index>next.index) return 1;

                if(prev.time<next.time) return -1;
                if(prev.time>next.time) return 1;
                return 0;
            })
            .collect(Collectors.toCollection(LinkedList::new));
        
        PriorityQueue<Job> workQueue = new PriorityQueue<>((prev,next)->{
            if(prev.time<next.time) return -1;
            if(prev.time>next.time) return 1;
            
            if(prev.index<next.index) return -1;
            if(prev.index>next.index) return 1;
            return 0;
        });
        
		while(!jobList.isEmpty() || !workQueue.isEmpty()) {
            Job j = jobList.peek();
            if(j != null) {
                if(j.index<=currentIndex) {
                    workQueue.add(jobList.poll());
                    continue;
                }

                if(workQueue.isEmpty()) {
                    currentIndex=j.index;
                    workQueue.add(jobList.poll());
                    continue;
                }
            }

            if(!workQueue.isEmpty()){
                final Job poll = workQueue.poll();
                currentIndex = finish(poll, currentIndex, finishL);
            }
		}		
        
        return (int) finishL.stream().mapToInt(j->j.waitTime).average().getAsDouble();
    }
    
    public static int finish(Job j, int currentIndex, List<Job> finishL){
        currentIndex = currentIndex + j.time;
        j.waitTime = currentIndex - j.index;

        finishL.add(j);

        return currentIndex;
    }
    
    static class Job {
        int index; //시작시간
        int time; //소요시간
        int waitTime; //기다린시간
        
        Job(int index, int time){
            this.index = index;
            this.time = time;
        }
        
        public String toString() {
            return String.format("{index:%d,time:%d,waitTime:%d}",index,time,waitTime);
        }
    }
}
