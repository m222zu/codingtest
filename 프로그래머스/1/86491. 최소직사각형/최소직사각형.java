class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;
        
        for (int[] card : sizes) {
            int w = card[0];
            int h = card[1];
            
            if (w > h) {
                int temp = w;
                w = h;
                h = temp;
            }
            
            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }
        
        return maxWidth * maxHeight;
    }
}