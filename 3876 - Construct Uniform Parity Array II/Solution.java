class Solution {
    public boolean uniformArray(int[] nums1) {

        boolean hasOdd = false;
        boolean hasEven = false;

        for (int num : nums1) {
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }

        // Already all same parity
        if (!hasOdd || !hasEven) {
            return true;
        }

        // Find the smallest number
        int min = nums1[0];

        for (int num : nums1) {
            min = Math.min(min, num);
        }

        // If the smallest number is odd,
        // every larger even number can become odd.
        if (min % 2 == 1) {
            return true;
        }

        // If the smallest number is even,
        // every larger odd number can become odd,
        // but even numbers cannot become odd using the minimum.
        //
        // Therefore, we need to check whether all even numbers
        // can remain even.
        return false;
    }
}