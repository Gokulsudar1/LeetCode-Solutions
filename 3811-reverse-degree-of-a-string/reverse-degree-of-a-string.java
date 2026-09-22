class Solution {
    public int reverseDegree(String s) {
        int sum =0;
        for(int i=0;i<s.length();i++){
            int nv = s.charAt(i) - 'a' +1;
            int rv = 26 - nv + 1;
            sum+=rv*(i+1);
        }
        return sum;
    }
}