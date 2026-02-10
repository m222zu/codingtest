import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        
        for (int i: arr) {
            if (result.isEmpty() || result.get(result.size() - 1) != i) {
                result.add(i);
            }
        }
        
        int[] answer = new int[result.size()];
        
        for (int j=0; j<result.size(); j++) {
            answer[j] = result.get(j);
        }
        
        return answer;
    }
}