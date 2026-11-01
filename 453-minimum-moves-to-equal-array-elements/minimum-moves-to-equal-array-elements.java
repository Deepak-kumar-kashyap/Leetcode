class Solution {
    public int minMoves(int[] nums) {
        
        int low = Integer.MAX_VALUE;
        int ans = 0;

        for(int n : nums){
            if(n < low){
                low = n;
            }
        }
        for(int n : nums){
            ans += n - low;
        }

        return ans;
    }
}

