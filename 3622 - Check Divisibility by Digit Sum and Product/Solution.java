class Solution {
    public boolean checkDivisibility(int n) {
        int t = n;
        int sum = 0;
        int product = 1;

        while(t != 0){
            int infinia = t % 10;

            sum += infinia;
            product *= infinia;

            t /= 10;
        }
        return n % (sum + product) == 0;
    }
}