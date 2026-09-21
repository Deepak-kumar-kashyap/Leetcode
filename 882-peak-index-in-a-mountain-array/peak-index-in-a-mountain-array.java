class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int res = 0;

        int peak = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > peak){
                res = i;
                peak = arr[i];
            }
        }

        return res;
    }
}