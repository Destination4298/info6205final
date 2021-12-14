package neu.info6205.edu;
import java.util.List;

public class Solution {
	
	
	private int connectedSquareSum(int graph_nodes, List<Integer> graph_from, List<Integer> graph_to){
		int result = 0;
        int temp = 0;
        int i, j;
        int[] visited = new int[graph_nodes];
        int[] head = new int[graph_nodes];
        for (i = 0; i < graph_nodes; i++) {
            head[i] = i;
        }
        boolean flag = true;
        while (flag) {
            flag = false;
            for (i = 0; i < graph_from.size(); i++) {
            if (head[graph_from.get(i)] < head[graph_to.get(i)]) {
                head[graph_to.get(i)] = head[graph_from.get(i)];
                flag = true;
            }
            else if (head[graph_from.get(i)] > head[graph_to.get(i)]) {
                head[graph_from.get(i)] = head[graph_to.get(i)];
                flag = true;
            }
            }
        }
        
        for (i = 0; i < graph_nodes; i++) {
            if (head[i] == i) {
                temp = 0;
                for (j = 0; j < graph_nodes; j++) {
                    if (head[i] == head[j]) {
                        temp++;
                    }
                }
                result += (temp * temp);
            }
        }

        return result;
    	
    
    
	}
	
	
	
	
	
	
	
	
	
	
}
