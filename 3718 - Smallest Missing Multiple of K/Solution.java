class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums){
            seen.add(num);
        }

        int multi = k;

        while(seen.contains(multi)){
            multi += k;
        }
        return multi;
    }
}