class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int might[] = new int[n];
        might[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            might[i] = Math.min(nums[i], might[i+1]);
        }

        int maxleft = nums[0];

        for(int i=0; i<n; i++){
            maxleft = Math.max(nums[i], maxleft);

            int insta = maxleft - might[i];

            if(insta <= k) 
                return i;
        }

        return -1;
    }
}