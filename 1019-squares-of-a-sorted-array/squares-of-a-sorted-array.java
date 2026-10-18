class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int right = nums.length-1;
        int left = 0;
        int i = nums.length-1;
        int[] res = new int[nums.length];
        int leftsq = 0;
        int rightsq = 0;

        while(left <= right){
            leftsq = nums[left] * nums[left];
            rightsq = nums[right] * nums[right];

            if(leftsq > rightsq){
                res[i] = leftsq;
                left++;
            }
            else{
                res[i] = rightsq;
                right--;
            }
            i--;
        }
        return res;
    }
}