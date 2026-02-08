import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> kinds = new HashSet<>();
        for (int i : nums) {
            kinds.add(i);
        }
        
        int n = nums.length / 2;
        return Math.min(kinds.size(), n);
        
    }
}