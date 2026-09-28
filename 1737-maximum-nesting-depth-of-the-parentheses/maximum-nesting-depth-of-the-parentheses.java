class Solution {
    public int maxDepth(String s) {
        int curr = 0;
        int mx = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                curr++;
                mx = Math.max(mx, curr);
            } 
            else if(c == ')') curr--;
        }
        return mx;
    }
}