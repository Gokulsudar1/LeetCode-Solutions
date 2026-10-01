class Solution {
    public long minimumSteps(String s) {
        long black = 0;
        long ans = 0;
        for(char c : s.toCharArray()){
            if(c == '1') black++;
            else ans+=black;
        }
        return ans;
    }
}