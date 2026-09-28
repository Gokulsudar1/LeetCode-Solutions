class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        int l = 0;
        boolean odd = false;
        for(int freq : map.values()){
            if(freq%2 == 0) l+=freq;
            else {
                l+=freq-1;
                odd = true;
            } 
        }
        if(odd) l++;
        return l;
    }
}