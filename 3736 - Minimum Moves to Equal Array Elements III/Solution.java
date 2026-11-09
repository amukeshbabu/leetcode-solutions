class Solution {
    public int minMoves(int[] nums) {
        int count = 0;
        int last = nums[nums.length-1];
        for(int i=0; i<nums.length; i++){
            if(nums[i] != last){
                nums[i]++;
                count++;
            }
        }
        return count;
    }
}