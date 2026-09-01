class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);

            // Convert 'A' → 1, 'B' → 2, ..., 'Z' → 26
            int value = c - 'A' + 1;

            // Multiply current result by 26 and add new value
            result = result * 26 + value;
        }

        return result;
    }
}