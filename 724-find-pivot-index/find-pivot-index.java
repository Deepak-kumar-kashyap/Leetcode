class Solution {
    public int pivotIndex(int[] nums) {
        
        int n = nums.length;

        int lsum[] = new int[n];
        int rsum[] = new int[n];

        lsum[0] = nums[0];
        for(int i = 1; i < n; i++){
            lsum[i] = lsum[i-1] + nums[i];
        }

        rsum[n-1] = nums[n-1];

        for(int i = n-2; i>=0; i--){
            rsum[i] = rsum[i+1] + nums[i];
        }

        for(int i = 0; i < n; i++){
            if(rsum[i] == lsum[i]){
                return i;
            }
        }
        return -1;
    }
}