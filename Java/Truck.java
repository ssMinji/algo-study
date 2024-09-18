import java.util.Queue;
import java.util.LinkedList;

class Truck {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int temp_weight = 0, idx=0;
        Queue<Integer> queue = new LinkedList<>();           

        while(true){
            if(idx == truck_weights.length) break;
            if(queue.size() == bridge_length){
                temp_weight-=queue.poll();
            }
            else if(temp_weight+truck_weights[idx]>weight){

                queue.offer(0);
                answer++;
            }else{
                queue.offer(truck_weights[idx]);
                temp_weight+=truck_weights[idx];
                answer++;
                idx++;
            }            
        }

        return answer + bridge_length;
    }
}