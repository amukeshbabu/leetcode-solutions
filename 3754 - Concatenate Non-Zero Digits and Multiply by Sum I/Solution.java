class Solution {
    public long sumAndMultiply(int n) {
        int field = 0;
        int sum = 0;
        String str = String.valueOf(n);

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != '0'){
                int digit = str.charAt(i) - '0';
                field = field * 10 + digit;
                sum += digit;
            }
        }
        return (long)field * sum;
    }
}