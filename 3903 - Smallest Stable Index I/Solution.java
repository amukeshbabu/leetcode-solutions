class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int minright[] = new int[n];
        minright[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            minright[i] = Math.min(nums[i] , minright[i+1]);
        }

        int maxleft = nums[0];

        for(int i=0; i<n; i++){
            maxleft = Math.max(nums[i], maxleft);

            if(maxleft - minright[i] <=k){
                return i;
            }
        }
        
    return -1;
    }
}