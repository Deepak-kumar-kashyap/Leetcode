class Solution {
    public int maxProduct(int[] nums) {
        
        int l = 0;
        int sl = 0;

        for(int ele : nums){
            if(ele >  l){
                sl = l;
                l = ele;
            }
            else if(ele > sl){
                sl = ele;
            }
        }

        return (l-1) * (sl-1);
    }
}