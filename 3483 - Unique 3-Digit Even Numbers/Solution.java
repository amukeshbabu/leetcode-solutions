class Solution {
    public int totalNumbers(int[] digits) {
        int freq[] = new int[10];

        for(int d : digits){
            freq[d]++;
        }

        int count = 0;

        for(int h=1; h<10; h++){
            if(freq[h] == 0) continue;

            freq[h]--;

            for(int t=0; t<10; t++){
                if(freq[t] == 0) continue;

                freq[t]--;

                for(int u=0; u<9; u+=2){
                    if(freq[u] == 0) continue;
                    count ++;
                }

                freq[t]++;
            }
            freq[h]++;
        }
        return count;
    }
}