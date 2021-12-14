package neu.info6205.edu;
import java.util.List;

public class Solution {
    public int connectedSquareSum(int graph_nodes, List<Integer> graph_from, List<Integer> graph_to){

    	int result = 0;
        int count = 0;
        int i = 0;
        int j = 0;
        int[] visited = new int[graph_nodes];
        int[] head = new int[graph_nodes];
        
        
        
        for (i = 0; i < graph_nodes; i++) {
            head[i] = i;
        }
        boolean execute = true;
        
        
        
        
        while (execute) {
        	execute = false;
            for (i = 0; i < graph_from.size(); i++) {
            if (head[graph_from.get(i)] < head[graph_to.get(i)]) {
                head[graph_to.get(i)] = head[graph_from.get(i)];
                execute = true;
            }
            
            
            else if (head[graph_from.get(i)] > head[graph_to.get(i)]) {
            	
                head[graph_from.get(i)] = head[graph_to.get(i)];
                execute = true;
            }
            }
        }
        
        for (i = 0; i < graph_nodes; i++) {
            if (head[i] == i) {
            	count = 0;
                for (j = 0; j < graph_nodes; j++) {
                    if (head[i] == head[j]) {
                    	count++;
                    }
                }
                result += (count * count);
            }
        }

        return result;
    }

}
