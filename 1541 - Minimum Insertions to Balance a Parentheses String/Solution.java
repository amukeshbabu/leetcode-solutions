class Solution {
    public int minInsertions(String s) {
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                count= count+2;
            }else{
                if(count > 0){
                    count--;
                }else{
                    count = count+2;
                }
            }
        }
        return count;
    }
}