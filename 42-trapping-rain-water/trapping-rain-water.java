class Solution {
    public int trap(int[] height) {
        
        int leftmax = 0;
        int rightmax = 0;
        int left = 0;
        int right = height.length-1;
        int water = 0;

        while(left < right){

            if(height[left] < height[right]){
                leftmax = Math.max(leftmax, height[left]);
                water += leftmax - height[left++];
            }

            else{
                rightmax = Math.max(rightmax, height[right]);
                water += rightmax - height[right--];
            }
        }

        return water;
    }
}